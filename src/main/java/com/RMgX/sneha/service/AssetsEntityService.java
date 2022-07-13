package com.RMgX.sneha.service;

import java.util.List;
import java.util.Locale.Category;

import com.RMgX.sneha.Entity.AssetsEntity;
import com.RMgX.sneha.Entity.CategoryEntity;

public interface AssetsEntityService {

	Category Assets(AssetsEntity assets);

	void deleteAsset(long AssetId);

	CategoryEntity getCategoryById(long AssetId);

	List<Category> getAllAsset();

	Category updateCategory(AssetsEntity assets);

	AssetsEntity updateAssetsEntity(AssetsEntityService assetsEntityService);

	AssetsEntity getAssetsEntityById(long AssetId);

	Object getAllAssets();

	Object updateassetsEntityService(AssetsEntityService assetsEntityService);

	void deleteassetsEntityService(long id);

}
