package com.k.pmpstudy

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project
import com.intellij.vcs.log.impl.VcsProjectLog
import git4idea.GitBranch
import git4idea.actions.branch.GitSingleBranchAction
import git4idea.repo.GitRepository

class FocusBranchInLogAction : GitSingleBranchAction() {
    override fun actionPerformed(
        e: AnActionEvent,
        project: Project,
        repositories: List<GitRepository>,
        reference: GitBranch,
    ) {
        val (repo, hash) = repositories
            .firstNotNullOfOrNull { r -> r.branches.getHash(reference)?.let { r to it } }
            ?: return
        VcsProjectLog.showRevisionInMainLog(project, repo.root, hash)
    }
}
