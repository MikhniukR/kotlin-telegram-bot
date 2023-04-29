package com.github.kotlintelegrambot

import com.github.kotlintelegrambot.dispatcher.command
import com.github.kotlintelegrambot.entities.ChatId

fun main() {
    val proofOfConcept = bot {
        token = "5614246241:AAFlNza-lqUkyjm07ORNjbyG4Vrruut_Bw8"
        dispatch {
            command("start") {
                val result = bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Gamarjobat dzma " + message.chat.firstName)
                result.fold({
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "chat: " + it.chat)
                },{
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = it.toString())
                })
            }
        }
    }
    proofOfConcept.startPolling()

    val kbGovnoPalkiIsolenta = bot {
        token = "6090450546:AAEbBEJoBtPEA8NFU3DDADmcrsVcEoRxfbA"
        dispatch {
            command("start") {
                val result = bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "Hi, ${message.chat.firstName} what you want to do?")
                result.fold({
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = "chat: " + it.chat)
                },{
                    bot.sendMessage(chatId = ChatId.fromId(message.chat.id), text = it.toString())
                })
            }
        }
    }

    kbGovnoPalkiIsolenta.startPolling()
}
