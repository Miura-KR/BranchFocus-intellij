package com.k.pmpstudy

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.vcs.log.Hash
import com.intellij.vcs.log.impl.VcsProjectLog
import git4idea.GitBranch
import git4idea.GitReference
import git4idea.GitTag
import git4idea.actions.ref.GitSingleRefAction
import git4idea.repo.GitRepository
import java.util.function.Supplier

class FocusBranchInLogAction : GitSingleRefAction<GitReference>(Supplier { "" }) {
    override fun actionPerformed(
        e: AnActionEvent,
        project: Project,
        repositories: List<GitRepository>,
        reference: GitReference,
    ) {
        val (repo, hash) = repositories
            .firstNotNullOfOrNull { r -> hashOf(r, reference)?.let { r to it } }
            ?: return
        VcsProjectLog.showRevisionInMainLog(project, repo.root, hash)
    }

    private fun hashOf(repo: GitRepository, reference: GitReference): Hash? = when (reference) {
        is GitBranch -> repo.branches.getHash(reference)
        is GitTag -> repo.tagsHolder.state.value.tagsToCommitHashes[reference]
        else -> null
    }
}
