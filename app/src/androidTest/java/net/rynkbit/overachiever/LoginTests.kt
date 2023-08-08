package net.rynkbit.overachiever

import android.content.Context
import androidx.compose.ui.test.SemanticsMatcher
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import com.google.android.gms.common.SignInButton
import net.rynkbit.overachiever.ui.login.Login
import org.junit.Assert.fail
import org.junit.Rule
import org.junit.Test

class LoginTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun googleSignInButtonExists() {
        val context: Context = InstrumentationRegistry.getInstrumentation().targetContext

        composeTestRule.setContent {
            Login()
        }

        composeTestRule.onNodeWithTag(SignInButton::class.simpleName!!).assertExists()
        composeTestRule.onNodeWithText(context.getString(R.string.welcome_to_overachiver)).assertExists()

        fail()
    }
}