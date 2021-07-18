package com.investments.informationpanel.controller.v1

import com.investments.informationpanel.vo.FinancialAssetVO
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.context.annotation.RequestScope

@RestController
@RequestMapping("/v1/information")
class InformationController {

    @GetMapping("/{financialAsset}")
    fun getInfoFinancialAsset(@PathVariable financialAsset: String) : ResponseEntity<FinancialAssetVO>{
        val information = FinancialAssetVO(financialAsset)
        return ResponseEntity.ok().body(information)
    }
}