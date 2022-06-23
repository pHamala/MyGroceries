package com.phama.mygroceries

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.phama.mygroceries.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGroceriesTheme {
                LoginScreen()
            }
        }
    }
}

    @Composable
    fun LoginScreen() {

        val focusManager = LocalFocusManager.current

        var email = remember { mutableStateOf("")}
        var password = remember { mutableStateOf("")}

       /* TODO Password length
        val isPasswordValid by derivedStateOf {
        } */

        val isPasswordVisible by remember {
            mutableStateOf(false)
        }



        Surface(
            modifier = Modifier
                .fillMaxSize(), color = MaterialTheme.colors.BackgroundColor
        ){
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painterResource(id = R.drawable.loginimage),
                contentDescription = "Loginscreen image",
                modifier = Modifier.size(300.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(32.dp)
            ) {

                Text(
                    text = "Login",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    modifier = Modifier.padding(
                        bottom = 16.dp,
                        top = 16.dp
                    )
                )

                TextField(
                    value = email.value,
                    onValueChange = {email.value = it},
                    label = null,
                    placeholder = { Text(text = "Email address")},
                    trailingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email")},
                    singleLine = true,
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.TextFieldColor,
                        cursorColor = Color.Black,
                        disabledLabelColor = MaterialTheme.colors.TextFieldColor,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    shape = Shapes.medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {focusManager.moveFocus(focusDirection = FocusDirection.Down)}
                    )

                )

                TextField(
                    value = password.value,
                    onValueChange = {password.value = it},
                    placeholder = { Text(text = "password")},
                    trailingIcon = { (Icon(imageVector = Icons.Default.Lock, contentDescription = "password"))},
                    singleLine = true,
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = MaterialTheme.colors.TextFieldColor,
                        cursorColor = Color.Black,
                        disabledLabelColor = MaterialTheme.colors.TextFieldColor,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent
                    ),
                    shape = Shapes.medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {focusManager.clearFocus()}
                    ),

                )

                Row(
                    horizontalArrangement = Arrangement.End,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                ) {

                    TextButton(onClick = {}) {
                        Text(
                            text = "Forgot password?",
                            color = Color.Black,
                            fontSize = 14.sp,
                        )
                    }
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.ButtonColor),
                    shape = Shapes.medium,

                ) {

                    Text(
                        text = "LOGIN",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = MaterialTheme.colors.TextFieldColor
                    )
                }

                Text(
                    text = "Or",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 16.dp)
                )
                }
            }

            }

        }


@Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MyGroceriesTheme {
        LoginScreen()
        }
    }