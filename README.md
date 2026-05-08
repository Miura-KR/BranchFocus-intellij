# BranchFocus

An IntelliJ Platform plugin that lets you jump from a branch or tag in the Git
Branches popup directly to its tip commit in the Git Log.

## Features

- Adds a **Focus in Log** action to the Git Branches popup (under the
  `Git.Branch.Checkout` group).
- Works on local branches, remote branches, and tags.
- Opens the Git Log tool window if it isn't already, and scrolls/selects the
  tip commit of the chosen reference.

## Usage

1. Open the Git Branches popup (status bar Git widget at the bottom-right, or
   `Git > Branches…`).
2. Hover over a branch or a tag.
3. Click **Focus in Log**.

## Useful links

- [IntelliJ Platform SDK](https://plugins.jetbrains.com/docs/intellij)
- [IntelliJ Platform Gradle Plugin](https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html)
- [Plugin Configuration File (plugin.xml)](https://plugins.jetbrains.com/docs/intellij/plugin-configuration-file.html)

---

# BranchFocus（日本語）

IntelliJ Platform 向けプラグインです。Gitブランチ・ポップアップから、選択中の
ブランチまたはタグの先端コミットへ Git Log 上で一発でジャンプできます。

## 機能

- Gitブランチ・ポップアップに **Focus in Log** アクションを追加します
  （`Git.Branch.Checkout` グループ配下）。
- ローカルブランチ・リモートブランチ・タグに対応しています。
- Git Log ツールウィンドウが未表示なら自動で開き、選択した参照の先端コミットへ
  スクロール・選択します。

## 使い方

1. Gitブランチ・ポップアップを開く（右下のGitウィジェット、または
   `Git > Branches…`）。
2. ブランチまたはタグにカーソルを合わせる。
3. **Focus in Log** をクリック。
