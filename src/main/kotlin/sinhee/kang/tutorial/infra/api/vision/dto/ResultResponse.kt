package sinhee.kang.tutorial.infra.api.vision.dto

data class ResultResponse (
    var label_kr: List<String> = listOf(),

    var label: List<String> = listOf()
)
