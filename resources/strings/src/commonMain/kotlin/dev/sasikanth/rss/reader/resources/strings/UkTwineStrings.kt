/*
 * Copyright 2023 Sasikanth Miriyampalli
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.sasikanth.rss.reader.resources.strings

import cafe.adriel.lyricist.LyricistStrings

@LyricistStrings(languageTag = Locales.EN, default = true)
val UkTwineStrings =
  TwineStrings(
    appName = "Twine",
    postSourceUnknown = "Невідомо",
    buttonAll = "ВСЕ",
    buttonAddFeed = "Додати стрічку",
    buttonGoBack = "Повернутись",
    buttonCancel = "Скасувати",
    buttonAdd = "Додати",
    buttonChange = "Готово",
    feedEntryHint = "Введіть посилання на стрічку",
    share = "Поділитись",
    scrollToTop = "Скролити нагору",
    noFeeds = "Немає стрічок!",
    swipeUpGetStarted = "Свайпніть вгору щоб почати",
    feedNameHint = "Назва стрічки",
    editFeedName = "Редагувати",
    errorUnsupportedFeed = "Link doesn't contain any RSS/Atom feed.",
    errorMalformedXml = "Provided link doesn\'t contain valid RSS/Atom feed",
    errorRequestTimeout = "Timeout, check your network connection and try again later",
    errorFeedNotFound = { "($it): No content found at the given link." },
    errorServer = {
      "($it): Server error. Please try again later or contact the website administrator."
    },
    errorTooManyRedirects = "The given URL has too many redirects. Please use a different URL.",
    errorUnAuthorized = { "($it): You are not authorized to access content at this link." },
    errorUnknownHttpStatus = { "Failed to load content with HTTP code: ($it)" },
    postsSearchHint = "Search posts",
    searchSortNewest = "Newest",
    searchSortNewestFirst = "Newest first",
    searchSortOldest = "Oldest",
    searchSortOldestFirst = "Oldest first",
    searchResultsCount = { count ->
      when (count) {
        1 -> "$count result"
        else -> "$count results"
      }
    },
    bookmark = "Bookmark",
    bookmarks = "Bookmarks",
    bookmarksPlaceholder = "Bookmarked posts will appear here 🔖",
    settings = "Settings",
    moreMenuOptions = "More menu options",
    settingsHeaderBehaviour = "Behavior",
    settingsHeaderFeedback = "Feedback & bug reports",
    settingsHeaderOpml = "OPML",
    settingsBrowserTypeTitle = "Use in-app browser",
    settingsBrowserTypeSubtitle = "When turned off, links will open in your default browser.",
    settingsEnableBlurTitle = "Enable blur in homepage",
    settingsEnableBlurSubtitle =
      "When disabled, displays gradients instead of blurred images. May improve performance.",
    settingsShowUnreadCountTitle = "Show unread posts count",
    settingsShowUnreadCountSubtitle = "Displays a bubble above feed selections",
    settingsReportIssue = "Report an issue",
    settingsVersion = { versionName, versionCode -> "$versionName ($versionCode)" },
    settingsAboutTitle = "About Twine",
    settingsAboutSubtitle = "Get to know the authors",
    settingsOpmlImport = "Import",
    settingsOpmlExport = "Export",
    settingsOpmlImporting = { progress -> "Importing.. $progress%" },
    settingsOpmlExporting = { progress -> "Exporting.. $progress%" },
    settingsOpmlCancel = "Cancel",
    settingsPostsDeletionPeriodTitle = "Delete read posts older than",
    settingsPostsDeletionPeriodOneWeek = "1 week",
    settingsPostsDeletionPeriodOneMonth = "1 month",
    settingsPostsDeletionPeriodThreeMonths = "3 months",
    settingsPostsDeletionPeriodSixMonths = "6 months",
    settingsPostsDeletionPeriodOneYear = "1 year",
    settingsShowReaderViewTitle = "Enable reader view",
    settingsShowReaderViewSubtitle = "Articles will be shown in a simplified, easy-to-read view",
    feeds = "Feeds",
    editFeeds = "Edit feeds",
    comments = "Comments",
    about = "About",
    aboutRoleDeveloper = "Developer",
    aboutRoleDesigner = "Designer",
    aboutSocialTwitter = "Twitter",
    aboutSocialThreads = "Threads",
    aboutSocialGitHub = "GitHub",
    aboutSocialWebsite = "Website",
    feedsSearchHint = "Search feeds",
    allFeeds = "All Feeds",
    pinnedFeeds = "Pinned",
    openWebsite = "Open Website",
    markAllAsRead = "Mark All as Read",
    noNewPosts = "No new content",
    noNewPostsSubtitle = "Check back later or pull down to check for new content now",
    postsAll = "All",
    postsUnread = "Unread",
    postsToday = "Today",
    openSource = "Support Open Source",
    openSourceDesc =
      "Twine is an open source project and is available for free to use. Click here to know more on how to support this project or, view source code of Twine or some of my other popular projects.",
    markAsRead = "Mark as read",
    markAsUnRead = "Mark as unread",
    removeFeed = "Remove feed",
    delete = "Delete",
    removeFeedDesc = { "Do you want to remove \"${it}\"?" },
    alwaysFetchSourceArticle = "Always fetch full articles in reader view",
    getFeedInfo = "Get Info",
    newTag = "New tag",
    tags = "Tags",
    addTagTitle = "Add tag",
    tagNameHint = "Name",
    tagSaveButton = "Save",
    deleteTagTitle = "Delete tag?",
    deleteTagDesc =
      "Tag will be deleted and removed from all the assigned feeds. Your feeds won't be deleted",
    feedOptionShare = "Share",
    feedOptionWebsite = "Website",
    feedOptionRemove = "Remove",
    feedTitleHint = "Title",
    noUnreadPostsInFeed = "No unread articles",
    numberOfUnreadPostsInFeed = { numberOfUnreadPosts ->
      when (numberOfUnreadPosts) {
        1L -> "$numberOfUnreadPosts unread article"
        else -> "$numberOfUnreadPosts unread articles"
      }
    }
  )
