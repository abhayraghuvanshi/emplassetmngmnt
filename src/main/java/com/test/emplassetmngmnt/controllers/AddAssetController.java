package com.test.emplassetmngmnt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.emplassetmngmnt.beans.Asset;
import com.test.emplassetmngmnt.repository.AssetRepository;

@Controller
public class AddAssetController {

	@Autowired
	private AssetRepository assetRepository;

	@PostMapping("/insertaddasset")
	public String addEmployee(@ModelAttribute("newAsset") Asset asset, Model model) {
		System.out.println("in add new employee controller : AddEmployeeController");
		assetRepository.save(asset);
		System.out.println("asset just saved::-->" + asset);
		model.addAttribute("dataSaved", "added new asset");
		return "home";
	}
}
