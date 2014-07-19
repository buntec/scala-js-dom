package org.scalajs.dom

/**
 * The KeyboardEvent.key attribute of an event must always contain one of these control key or character values (even if
 * the value is 'Unidentified').
 *
 * If the key represents one of the set of printable control characters which has a Unicode character entry, such as the
 * tab key, the KeyboardEvent.key attribute must have the key value (e.g., 'Tab').
 *
 * Implementations that are unable to identify a key must use the key value 'Unidentified'.
 *
 * Taken from http://www.w3.org/TR/DOM-Level-3-Events/#keys-special
 */
object KeyValue {

  // ===================================================================================================================
  // 6.3.1 Special Key Values

  /** This key value is used when an implementation is unable to identify another key value, due to either hardware, platform, or software constraints. */
  val Unidentified = "Unidentified"

  // ===================================================================================================================
  // 6.3.2 Modifier Keys

  /** The Alternative (Alt, Option, Menu) key. Enable alternate modifier function for interpreting concurrent or subsequent keyboard input. This key value is also used for the Apple 'Option' key. */
  val Alt = "Alt"

  /** The Alternate Graphics (AltGr or AltGraph) key. This key is used enable the ISO Level 3 shift modifier (the standard 'Shift' key is the level 2 modifier). */
  val AltGraph = "AltGraph"

  /** The Caps Lock (Capital) key. Toggle capital character lock function for interpreting subsequent keyboard input event. */
  val CapsLock = "CapsLock"

  /** The Control (Ctrl) key, to enable control modifier function for interpreting concurrent or subsequent keyboard input. */
  val Control = "Control"

  /** The Function switch (Fn) key. Activating this key simultaneously with another key changes that key's value to an alternate character or function. This key is often handled directly in the keyboard hardware and does not usually generate key events. */
  val Fn = "Fn"

  /** The Function-Lock (FnLock, F-Lock) key. Activating this key switches the mode of the keyboard to changes some keys' values to an alternate character or function. This key is often handled directly in the keyboard hardware and does not usually generate key events. */
  val FnLock = "FnLock"

  /** The Hyper key. */
  val Hyper = "Hyper"

  /** The Meta key, to enable meta modifier function for interpreting concurrent or subsequent keyboard input. This key value is also used for the Apple 'Command' key. */
  val Meta = "Meta"

  /** The Number Lock key, to toggle numer-pad mode function for interpreting subsequent keyboard input. */
  val NumLock = "NumLock"

  /** The operating system key (e.g. the Windows Logo key). */
  val OS = "OS"

  /** The Shift key, to enable shift modifier function for interpreting concurrent or subsequent keyboard input. */
  val Shift = "Shift"

  /** The Super key. */
  val Super = "Super"

  /** The Symbol modifier key (used on some virtual keyboards). */
  val Symbol = "Symbol"

  /** The Symbol Lock key. */
  val SymbolLock = "SymbolLock"

  // ===================================================================================================================
  // 6.3.3 Whitespace Keys

  /** The Enter key, to activate current selection or accept current input. This key value is also used for the 'Return' (Macintosh numpad) key. */
  val Enter = "Enter"

  /** The Separator key, for context-sensitive text separators. */
  val Separator = "Separator"

  /** The Horizontal Tabulation (Tab) key. */
  val Tab = "Tab"

  val Spacebar = " "

  // ===================================================================================================================
  // 6.3.4 Navigation Keys

  /** The down arrow key, to navigate or traverse downward. */
  val ArrowDown = "ArrowDown"

  /** The left arrow key, to navigate or traverse leftward. */
  val ArrowLeft = "ArrowLeft"

  /** The right arrow key, to navigate or traverse rightward. */
  val ArrowRight = "ArrowRight"

  /** The up arrow key, to navigate or traverse upward. */
  val ArrowUp = "ArrowUp"

  /** The End key, used with keyboard entry to go to the end of content. */
  val End = "End"

  /** The Home key, used with keyboard entry, to go to start of content. */
  val Home = "Home"

  /** The Page Down key, to scroll down or display next page of content. */
  val PageDown = "PageDown"

  /** The Page Up key, to scroll up or display previous page of content. */
  val PageUp = "PageUp"

  // ===================================================================================================================
  // 6.3.5 Editing Keys

  /** The Backspace key. This key value is also used for the key labeled 'delete' on MacOS keyboards. */
  val Backspace = "Backspace"

  /** The Clear key, for removing current selected input. */
  val Clear = "Clear"

  /** The Copy key. */
  val Copy = "Copy"

  /** The Cursor Select (Crsel) key. */
  val CrSel = "CrSel"

  /** The Cut key. */
  val Cut = "Cut"

  /** The Delete (Del) Key. This key value is also used for the key labeled 'delete' on MacOS keyboards when modified by the 'Fn' key. */
  val Delete = "Delete"

  /** The Erase to End of Field key. This key deletes all characters from the current cursor position to the end of the current field. */
  val EraseEof = "EraseEof"

  /** The Extend Selection (Exsel) key. */
  val ExSel = "ExSel"

  /** The Insert (Ins) key, to toggle between text modes for insertion or overtyping. */
  val Insert = "Insert"

  /** The Paste key. */
  val Paste = "Paste"

  /** The Redo key. */
  val Redo = "Redo"

  /** The Undo key. */
  val Undo = "Undo"

  // ===================================================================================================================
  // 6.3.6 UI Keys

  /** The Accept (Commit, OK) key. Accept current option or input method sequence conversion. */
  val Accept = "Accept"

  /** The Again key, to redo or repeat an action. */
  val Again = "Again"

  /** The Attention (Attn) key. */
  val Attn = "Attn"

  /** The Cancel key. */
  val Cancel = "Cancel"

  /** Show the application's context menu. This key is commonly found between the right 'OS' key and the right 'Control' key. */
  val ContextMenu = "ContextMenu"

  /** The Escape (Esc) key, to initiate an escape sequence. */
  val Escape = "Escape"

  /** The Execute key. */
  val Execute = "Execute"

  /** The Find key. */
  val Find = "Find"

  /** Toggle display of help information. */
  val Help = "Help"

  /**
   * Pause the current state or application (as appropriate).
   *
   * Note: Do not use this value for the pause button on media controllers. Use 'MediaPause' instead.
   */
  val Pause = "Pause"

  /**
   * Play or resume the current state or application (as appropriate).
   *
   * Note: Do not use this value for the play button on media controllers. Use 'MediaPlay' instead.
   */
  val Play = "Play"

  /** The properties (Props) key. */
  val Props = "Props"

  /** The Scroll Lock key, to toggle between scrolling and cursor movement modes. */
  val ScrollLock = "ScrollLock"

  /** The ZoomIn key. */
  val ZoomIn = "ZoomIn"

  /** The ZoomOut key. */
  val ZoomOut = "ZoomOut"

  // ===================================================================================================================
  // 6.3.7 Device Keys

  /** The Brightness Down key. Typically controls the display brightness. */
  val BrightnessDown = "BrightnessDown"

  /** The Brightness Up key. Typically controls the display brightness. */
  val BrightnessUp = "BrightnessUp"

  /** The Camera key. */
  val Camera = "Camera"

  /** Toggle removable media to eject (open) and insert (close) state. */
  val Eject = "Eject"

  /** The LogOff key. */
  val LogOff = "LogOff"

  /**
   * Toggle power state.
   *
   * Note: Some devices might not expose this key to the operating environment.
   */
  val Power = "Power"

  /** The PowerOff key. Sometime called "PowerDown". */
  val PowerOff = "PowerOff"

  /** The Print Screen (PrintScrn, SnapShot) key, to initiate print-screen function. */
  val PrintScreen = "PrintScreen"

  /** The Hibernate key. This key saves the current state of the computer to disk so that it can be restored. The computer will then shutdown. */
  val Hibernate = "Hibernate"

  /** The Standby key. This key turns off the display and places the computer into a low-power mode without completely shutting down. It is sometimes called the "Suspend" or "Sleep" key. */
  val Standby = "Standby"

  /** The WakeUp key. */
  val WakeUp = "WakeUp"

  // ===================================================================================================================
  // 6.3.8 IME and Composition Keys

  /** The All Candidates key, to initate the multi-candidate mode. */
  val AllCandidates = "AllCandidates"

  /** The Alphanumeric key. */
  val Alphanumeric = "Alphanumeric"

  /** The Code Input key, to initiate the Code Input mode to allow characters to be entered by their code points. */
  val CodeInput = "CodeInput"

  /** The Compose key, also known as Multi_key on the X Window System. This key acts in a manner similar to a dead key, triggering a mode where subsequent key presses are combined to produce a different character. */
  val Compose = "Compose"

  /** The Convert key, to convert the current input method sequence. */
  val Convert = "Convert"

  /** The Final Mode (Final) key used on some Asian keyboards, to enable the final mode for IMEs. */
  val FinalMode = "FinalMode"

  /** Switch to the first character group. (ISO/IEC 9995) */
  val GroupFirst = "GroupFirst"

  /** Switch to the last character group. (ISO/IEC 9995) */
  val GroupLast = "GroupLast"

  /** Switch to the next character group. (ISO/IEC 9995) */
  val GroupNext = "GroupNext"

  /** Switch to the previous character group. (ISO/IEC 9995) */
  val GroupPrevious = "GroupPrevious"

  /** The Mode Change key, to toggle between or cycle through input modes of IMEs. */
  val ModeChange = "ModeChange"

  /** The Next Candidate function key. */
  val NextCandidate = "NextCandidate"

  /** The Nonconvert (Don't Convert) key, to accept current input method sequence without conversion in IMEs. */
  val NonConvert = "NonConvert"

  /** The Previous Candidate function key. */
  val PreviousCandidate = "PreviousCandidate"

  /** The Process key. */
  val Process = "Process"

  /** The Single Candidate function key. */
  val SingleCandidate = "SingleCandidate"

  // Keys specific to Korean keyboards

  /** The Roman Characters function key, also known as the 'Youngja' or 'Young' key. */
  val RomanCharacters = "RomanCharacters"

  /** The Hangul (Korean characters) Mode key, to toggle between Hangul and English modes. */
  val HangulMode = "HangulMode"

  /** The Hanja (Korean characters) Mode key. */
  val HanjaMode = "HanjaMode"

  /** The Junja (Korean characters) Mode key. */
  val JunjaMode = "JunjaMode"

  // Keys specific to Japanese keyboards

  /** The Zenkaku (Full-Width) Characters key. */
  val Zenkaku = "Zenkaku"

  /** The (Half-Width) Characters key. */
  val Hankaku = "Hankaku"

  /** The Zenkaku/Hankaku (full-width/half-width) toggle key. */
  val ZenkakuHankaku = "ZenkakuHankaku"

  /** The Kana Mode (Kana Lock) key. */
  val KanaMode = "KanaMode"

  /** The Kanji (Japanese name for ideographic characters of Chinese origin) Mode key. */
  val KanjiMode = "KanjiMode"

  /** The Hiragana (Japanese Kana characters) key. */
  val Hiragana = "Hiragana"

  /** The Katakana (Japanese Kana characters) key. */
  val Katakana = "Katakana"

  /** The Hiragana/Katakana toggle key. */
  val HiraganaKatakana = "HiraganaKatakana"

  /** The Eisu key. This key may close the IME, but it's purpose is defined by the current IME. */
  val Eisu = "Eisu"

  // ===================================================================================================================
  // General-Purpose Function Keys

  /** The F1 key, a general purpose function key, as index 1. */
  val F1 = "F1"

  /** The F2 key, a general purpose function key, as index 2. */
  val F2 = "F2"

  /** The F3 key, a general purpose function key, as index 3. */
  val F3 = "F3"

  /** The F4 key, a general purpose function key, as index 4. */
  val F4 = "F4"

  /** The F5 key, a general purpose function key, as index 5. */
  val F5 = "F5"

  /** The F6 key, a general purpose function key, as index 6. */
  val F6 = "F6"

  /** The F7 key, a general purpose function key, as index 7. */
  val F7 = "F7"

  /** The F8 key, a general purpose function key, as index 8. */
  val F8 = "F8"

  /** The F9 key, a general purpose function key, as index 9. */
  val F9 = "F9"

  /** The F10 key, a general purpose function key, as index 10. */
  val F10 = "F10"

  /** The F11 key, a general purpose function key, as index 11. */
  val F11 = "F11"

  /** The F12 key, a general purpose function key, as index 12. */
  val F12 = "F12"

  /** General purpose virtual function key, as index 1. */
  val Soft1 = "Soft1"

  /** General purpose virtual function key, as index 2. */
  val Soft2 = "Soft2"

  /** General purpose virtual function key, as index 3. */
  val Soft3 = "Soft3"

  /** General purpose virtual function key, as index 4. */
  val Soft4 = "Soft4"

  // ===================================================================================================================
  // Mediamedia Keys

  /** Close the current document or message. */
  val Close = "Close"

  /** Open an editor to forward the current message. */
  val MailForward = "MailForward"

  /** Open an editor to reply to the current message. */
  val MailReply = "MailReply"

  /** Send the current message. */
  val MailSend = "MailSend"

  /** Toggle media between play and pause states. */
  val MediaPlayPause = "MediaPlayPause"

  /** Select media. */
  val MediaSelect = "MediaSelect"

  /** Stop media playing, pausing, forwarding, rewinding, or recording, if not already stopped. */
  val MediaStop = "MediaStop"

  /** Seek to next media or program track. */
  val MediaTrackNext = "MediaTrackNext"

  /** Seek to previous media or program track. */
  val MediaTrackPrevious = "MediaTrackPrevious"

  /** Open a new document or message. */
  val New = "New"

  /** Open an existing document or message. */
  val Open = "Open"

  /** Print the current document or message. */
  val Print = "Print"

  /** Save the current document or message. */
  val Save = "Save"

  /** Spellcheck the current document or selection. */
  val SpellCheck = "SpellCheck"

  /** Decrease audio volume. */
  val VolumeDown = "VolumeDown"

  /** Increase audio volume. */
  val VolumeUp = "VolumeUp"

  /** Toggle between muted state and prior volume level. */
  val VolumeMute = "VolumeMute"

  // ===================================================================================================================
  // Application Keys

  /** The 'Calculator' key. This is often the generic 'LaunchApplication' key, as index 2. */
  val LaunchCalculator = "LaunchCalculator"

  /** The 'Calendar' key. */
  val LaunchCalendar = "LaunchCalendar"

  /** The 'Mail' key. */
  val LaunchMail = "LaunchMail"

  /** The 'Media Player' key. */
  val LaunchMediaPlayer = "LaunchMediaPlayer"

  /** The 'Music Player' key. */
  val LaunchMusicPlayer = "LaunchMusicPlayer"

  /** The 'My Computer' key. This is often the generic 'LaunchApplication' key, as index 1. */
  val LaunchMyComputer = "LaunchMyComputer"

  /** The 'Screen Saver' key. */
  val LaunchScreenSaver = "LaunchScreenSaver"

  /** The 'Spreadsheet' key. */
  val LaunchSpreadsheet = "LaunchSpreadsheet"

  /** The 'Web Browser' key. */
  val LaunchWebBrowser = "LaunchWebBrowser"

  /** The 'WebCam' key. */
  val LaunchWebCam = "LaunchWebCam"

  /** The 'Word Processor' key. */
  val LaunchWordProcessor = "LaunchWordProcessor"

  // ===================================================================================================================
  // Browser Keys

  /** Navigate to previous content or page in current history. */
  val BrowserBack = "BrowserBack"

  /** The Browser Favorites key. */
  val BrowserFavorites = "BrowserFavorites"

  /** Navigate to next content or page in current history. */
  val BrowserForward = "BrowserForward"

  /** The Browser Home key, used with keyboard entry, to go to the home page. */
  val BrowserHome = "BrowserHome"

  /** The Browser Refresh key, to refresh the current page or content. */
  val BrowserRefresh = "BrowserRefresh"

  /** The Browser Search key, to call up the user's preferred search page. */
  val BrowserSearch = "BrowserSearch"

  /** The Browser Stop key, to stop loading the current page or content. */
  val BrowserStop = "BrowserStop"

  // ===================================================================================================================
  // Media Controller Keys

  /** Adjust audio balance leftward. (VK_AUDIO_BALANCE_LEFT) */
  val AudioBalanceLeft = "AudioBalanceLeft"

  /** Adjust audio balance rightward. (VK_AUDIO_BALANCE_RIGHT) */
  val AudioBalanceRight = "AudioBalanceRight"

  /** Decrease audio bass boost or cycle down through bass boost states. (VK_BASS_BOOST_DOWN) */
  val AudioBassBoostDown = "AudioBassBoostDown"

  /** Increase audio bass boost or cycle up through bass boost states. (VK_BASS_BOOST_UP) */
  val AudioBassBoostUp = "AudioBassBoostUp"

  /** Adjust audio fader towards front. (VK_FADER_FRONT) */
  val AudioFaderFront = "AudioFaderFront"

  /** Adjust audio fader towards rear. (VK_FADER_REAR) */
  val AudioFaderRear = "AudioFaderRear"

  /** Advance surround audio mode to next available mode. (VK_SURROUND_MODE_NEXT) */
  val AudioSurroundModeNext = "AudioSurroundModeNext"

  /** Select next (numerically or logically) lower channel. (VK_CHANNEL_DOWN) */
  val ChannelDown = "ChannelDown"

  /** Select next (numerically or logically) higher channel. (VK_CHANNEL_UP) */
  val ChannelUp = "ChannelUp"

  /** General purpose color-coded media function key, as index 0 (red). (VK_COLORED_KEY_0) */
  val ColorF0Red = "ColorF0Red"

  /** General purpose color-coded media function key, as index 1 (green). (VK_COLORED_KEY_1) */
  val ColorF1Green = "ColorF1Green"

  /** General purpose color-coded media function key, as index 2 (yellow). (VK_COLORED_KEY_2) */
  val ColorF2Yellow = "ColorF2Yellow"

  /** General purpose color-coded media function key, as index 3 (blue). (VK_COLORED_KEY_3) */
  val ColorF3Blue = "ColorF3Blue"

  /** General purpose color-coded media function key, as index 4 (grey). (VK_COLORED_KEY_4) */
  val ColorF4Grey = "ColorF4Grey"

  /** General purpose color-coded media function key, as index 5 (brown). (VK_COLORED_KEY_5) */
  val ColorF5Brown = "ColorF5Brown"

  /** Toggle the display of Closed Captions. (VK_CC) */
  val ClosedCaptionToggle = "ClosedCaptionToggle"

  /** Adjust brightness of device, by toggling between or cycling through states. (VK_DIMMER) */
  val Dimmer = "Dimmer"

  /** Swap video sources. (VK_DISPLAY_SWAP) */
  val DisplaySwap = "DisplaySwap"

  /** Exit the current application. (VK_EXIT) */
  val Exit = "Exit"

  /** Clear program or content stored as favorite 0. (VK_CLEAR_FAVORITE_0) */
  val FavoriteClear0 = "FavoriteClear0"

  /** Clear program or content stored as favorite 1. (VK_CLEAR_FAVORITE_1) */
  val FavoriteClear1 = "FavoriteClear1"

  /** Clear program or content stored as favorite 2. (VK_CLEAR_FAVORITE_2) */
  val FavoriteClear2 = "FavoriteClear2"

  /** Clear program or content stored as favorite 3. (VK_CLEAR_FAVORITE_3) */
  val FavoriteClear3 = "FavoriteClear3"

  /** Select (recall) program or content stored as favorite 0. (VK_RECALL_FAVORITE_0) */
  val FavoriteRecall0 = "FavoriteRecall0"

  /** Select (recall) program or content stored as favorite 1. (VK_RECALL_FAVORITE_1) */
  val FavoriteRecall1 = "FavoriteRecall1"

  /** Select (recall) program or content stored as favorite 2. (VK_RECALL_FAVORITE_2) */
  val FavoriteRecall2 = "FavoriteRecall2"

  /** Select (recall) program or content stored as favorite 3. (VK_RECALL_FAVORITE_3) */
  val FavoriteRecall3 = "FavoriteRecall3"

  /** Store current program or content as favorite 0. (VK_STORE_FAVORITE_0) */
  val FavoriteStore0 = "FavoriteStore0"

  /** Store current program or content as favorite 1. (VK_STORE_FAVORITE_1) */
  val FavoriteStore1 = "FavoriteStore1"

  /** Store current program or content as favorite 2. (VK_STORE_FAVORITE_2) */
  val FavoriteStore2 = "FavoriteStore2"

  /** Store current program or content as favorite 3. (VK_STORE_FAVORITE_3) */
  val FavoriteStore3 = "FavoriteStore3"

  /** Toggle display of program or content guide. (VK_GUIDE) */
  val Guide = "Guide"

  /** If guide is active and displayed, then display next day's content. (VK_NEXT_DAY) */
  val GuideNextDay = "GuideNextDay"

  /** If guide is active and displayed, then display previous day's content. (VK_PREV_DAY) */
  val GuidePreviousDay = "GuidePreviousDay"

  /** Toggle display of information about currently selected context or media. (VK_INFO) */
  val Info = "Info"

  /** Toggle instant replay. (VK_INSTANT_REPLAY) */
  val InstantReplay = "InstantReplay"

  /** Launch linked content, if available and appropriate. (VK_LINK) */
  val Link = "Link"

  /** List the current program. (VK_LIST) */
  val ListProgram = "ListProgram"

  /** Toggle display listing of currently available live content or programs. (VK_LIVE) */
  val LiveContent = "LiveContent"

  /** Lock or unlock current content or program. (VK_LOCK) */
  val Lock = "Lock"

  /**
   * Show a list of media applications. (VK_APPS)
   *
   * Note: Do not confuse this key value with the Windows' VK_APPS / VK_CONTEXT_MENU key, which is encoded as 'ContextMenu'.
   */
  val MediaApps = "MediaApps"

  /** Initiate or continue forward playback at faster than normal speed, or increase speed if already fast forwarding. (VK_FAST_FWD) */
  val MediaFastForward = "MediaFastForward"

  /** Select previously selected channel or media. (VK_LAST) */
  val MediaLast = "MediaLast"

  /**
   * Pause the currently playing media. (VK_PAUSE)
   *
   * Note: Media controller devices should use this value rather than 'Pause' for their pause keys.
   */
  val MediaPause = "MediaPause"

  /** Initiate or continue media playback at normal speed, if not currently playing at normal speed. (VK_PLAY) */
  val MediaPlay = "MediaPlay"

  /** Initiate or resume recording of currently selected media. (VK_RECORD) */
  val MediaRecord = "MediaRecord"

  /** Initiate or continue reverse playback at faster than normal speed, or increase speed if already rewinding. (VK_REWIND) */
  val MediaRewind = "MediaRewind"

  /** Skip forward to next content or program. (VK_SKIP) */
  val MediaSkip = "MediaSkip"

  /** Cycle to next favorite channel (in favorites list). (VK_NEXT_FAVORITE_CHANNEL) */
  val NextFavoriteChannel = "NextFavoriteChannel"

  /** Cycle to next user profile (if there are multiple user profiles). (VK_USER) */
  val NextUserProfile = "NextUserProfile"

  /** Access on-demand content or programs. (VK_ON_DEMAND) */
  val OnDemand = "OnDemand"

  /** Move picture-in-picture window down. (VK_PINP_DOWN) */
  val PinPDown = "PinPDown"

  /** Move picture-in-picture window. (VK_PINP_MOVE) */
  val PinPMove = "PinPMove"

  /** Toggle display of picture-in-picture window. (VK_PINP_TOGGLE) */
  val PinPToggle = "PinPToggle"

  /** Move picture-in-picture window up. (VK_PINP_UP) */
  val PinPUp = "PinPUp"

  /** Decrease media playback speed. (VK_PLAY_SPEED_DOWN) */
  val PlaySpeedDown = "PlaySpeedDown"

  /** Reset playback to normal speed. (VK_PLAY_SPEED_RESET) */
  val PlaySpeedReset = "PlaySpeedReset"

  /** Increase media playback speed. (VK_PLAY_SPEED_UP) */
  val PlaySpeedUp = "PlaySpeedUp"

  /** Toggle random media or content shuffle mode. (VK_RANDOM_TOGGLE) */
  val RandomToggle = "RandomToggle"

  /** Not a physical key, but this key code is sent when the remote control battery is low. (VK_RC_LOW_BATTERY) */
  val RcLowBattery = "RcLowBattery"

  /** Toggle or cycle between media recording speeds. (VK_RECORD_SPEED_NEXT) */
  val RecordSpeedNext = "RecordSpeedNext"

  /** Toggle RF (radio frequency) input bypass mode (pass RF input directly to the RF output). (VK_RF_BYPASS) */
  val RfBypass = "RfBypass"

  /** Toggle scan channels mode. (VK_SCAN_CHANNELS_TOGGLE) */
  val ScanChannelsToggle = "ScanChannelsToggle"

  /** Advance display screen mode to next available mode. (VK_SCREEN_MODE_NEXT) */
  val ScreenModeNext = "ScreenModeNext"

  /** Toggle display of device settings screen. (VK_SETTINGS) */
  val Settings = "Settings"

  /** Toggle split screen mode. (VK_SPLIT_SCREEN_TOGGLE) */
  val SplitScreenToggle = "SplitScreenToggle"

  /** Toggle display of subtitles, if available. (VK_SUBTITLE) */
  val Subtitle = "Subtitle"

  /** Toggle display of teletext, if available (VK_TELETEXT). */
  val Teletext = "Teletext"

  /** Advance video mode to next available mode.(VK_VIDEO_MODE_NEXT) */
  val VideoModeNext = "VideoModeNext"

  /** Cause device to identify itself in some manner, e.g., audibly or visibly. (VK_WINK) */
  val Wink = "Wink"

  /** Toggle between full-screen and scaled content, or alter magnification level. (VK_ZOOM) */
  val ZoomToggle = "ZoomToggle"
}
