package net.rynkbit.overachiever.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.gms.common.SignInButton
import net.rynkbit.overachiever.R

@Composable
fun Login() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(64.dp)
        ) {
            WelcomeText()
            GoogleSignInButton()
        }
    }
}

@Composable
private fun WelcomeText() {
    Text(
        text = stringResource(R.string.welcome_to_overachiver),
        modifier = Modifier.padding(bottom = 16.dp)
    )
}

@Composable
private fun GoogleSignInButton() {
    AndroidView(
        modifier = Modifier
            .fillMaxWidth()
            .testTag(SignInButton::class.simpleName!!),
        factory = { context ->
            SignInButton(context).apply {
                setSize(SignInButton.SIZE_WIDE)
            }
        })
}