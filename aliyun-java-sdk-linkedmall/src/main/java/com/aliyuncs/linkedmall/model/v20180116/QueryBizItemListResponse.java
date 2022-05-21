/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryBizItemListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBizItemListResponse extends AcsResponse {

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private List<Item> itemList;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getItemList() {
		return this.itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public static class Item {

		private Long itemId;

		private String itemTitle;

		private String customizedItemName;

		private String mainPicUrl;

		private Long reservePrice;

		private Long categoryId;

		private Boolean canSell;

		private String taobaoShopName;

		private String extJson;

		private Long sellerId;

		private String lmItemId;

		private Long reservePrice1;

		private List<Sku> skuList;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getCustomizedItemName() {
			return this.customizedItemName;
		}

		public void setCustomizedItemName(String customizedItemName) {
			this.customizedItemName = customizedItemName;
		}

		public String getMainPicUrl() {
			return this.mainPicUrl;
		}

		public void setMainPicUrl(String mainPicUrl) {
			this.mainPicUrl = mainPicUrl;
		}

		public Long getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(Long reservePrice) {
			this.reservePrice = reservePrice;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public Boolean getCanSell() {
			return this.canSell;
		}

		public void setCanSell(Boolean canSell) {
			this.canSell = canSell;
		}

		public String getTaobaoShopName() {
			return this.taobaoShopName;
		}

		public void setTaobaoShopName(String taobaoShopName) {
			this.taobaoShopName = taobaoShopName;
		}

		public String getExtJson() {
			return this.extJson;
		}

		public void setExtJson(String extJson) {
			this.extJson = extJson;
		}

		public Long getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public Long getReservePrice1() {
			return this.reservePrice1;
		}

		public void setReservePrice1(Long reservePrice1) {
			this.reservePrice1 = reservePrice1;
		}

		public List<Sku> getSkuList() {
			return this.skuList;
		}

		public void setSkuList(List<Sku> skuList) {
			this.skuList = skuList;
		}

		public static class Sku {

			private Long skuId;

			private String skuPicUrl;

			private String skuTitle;

			private Long priceCent;

			private Long points;

			private Long pointsAmount;

			private String benefitId;

			private Boolean canSell;

			private Map<Object,Object> customizedAttributeMap;

			private Long taoBaoCurrentPrice;

			private List<GradePriceModel> gradePriceModels;

			private List<String> userLabelList;

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public String getSkuPicUrl() {
				return this.skuPicUrl;
			}

			public void setSkuPicUrl(String skuPicUrl) {
				this.skuPicUrl = skuPicUrl;
			}

			public String getSkuTitle() {
				return this.skuTitle;
			}

			public void setSkuTitle(String skuTitle) {
				this.skuTitle = skuTitle;
			}

			public Long getPriceCent() {
				return this.priceCent;
			}

			public void setPriceCent(Long priceCent) {
				this.priceCent = priceCent;
			}

			public Long getPoints() {
				return this.points;
			}

			public void setPoints(Long points) {
				this.points = points;
			}

			public Long getPointsAmount() {
				return this.pointsAmount;
			}

			public void setPointsAmount(Long pointsAmount) {
				this.pointsAmount = pointsAmount;
			}

			public String getBenefitId() {
				return this.benefitId;
			}

			public void setBenefitId(String benefitId) {
				this.benefitId = benefitId;
			}

			public Boolean getCanSell() {
				return this.canSell;
			}

			public void setCanSell(Boolean canSell) {
				this.canSell = canSell;
			}

			public Map<Object,Object> getCustomizedAttributeMap() {
				return this.customizedAttributeMap;
			}

			public void setCustomizedAttributeMap(Map<Object,Object> customizedAttributeMap) {
				this.customizedAttributeMap = customizedAttributeMap;
			}

			public Long getTaoBaoCurrentPrice() {
				return this.taoBaoCurrentPrice;
			}

			public void setTaoBaoCurrentPrice(Long taoBaoCurrentPrice) {
				this.taoBaoCurrentPrice = taoBaoCurrentPrice;
			}

			public List<GradePriceModel> getGradePriceModels() {
				return this.gradePriceModels;
			}

			public void setGradePriceModels(List<GradePriceModel> gradePriceModels) {
				this.gradePriceModels = gradePriceModels;
			}

			public List<String> getUserLabelList() {
				return this.userLabelList;
			}

			public void setUserLabelList(List<String> userLabelList) {
				this.userLabelList = userLabelList;
			}

			public static class GradePriceModel {

				private String characteristicCode;

				private String characteristicName;

				private String subBizCode;

				private Boolean canBuy;

				private Boolean exclusive;

				private Boolean recommend;

				private Long priceCent;

				private Long pointsAmount;

				private Long points;

				private Long pointPrice;

				private String showName;

				private String accessUrl;

				private String icon;

				private List<String> userLabelList2;

				public String getCharacteristicCode() {
					return this.characteristicCode;
				}

				public void setCharacteristicCode(String characteristicCode) {
					this.characteristicCode = characteristicCode;
				}

				public String getCharacteristicName() {
					return this.characteristicName;
				}

				public void setCharacteristicName(String characteristicName) {
					this.characteristicName = characteristicName;
				}

				public String getSubBizCode() {
					return this.subBizCode;
				}

				public void setSubBizCode(String subBizCode) {
					this.subBizCode = subBizCode;
				}

				public Boolean getCanBuy() {
					return this.canBuy;
				}

				public void setCanBuy(Boolean canBuy) {
					this.canBuy = canBuy;
				}

				public Boolean getExclusive() {
					return this.exclusive;
				}

				public void setExclusive(Boolean exclusive) {
					this.exclusive = exclusive;
				}

				public Boolean getRecommend() {
					return this.recommend;
				}

				public void setRecommend(Boolean recommend) {
					this.recommend = recommend;
				}

				public Long getPriceCent() {
					return this.priceCent;
				}

				public void setPriceCent(Long priceCent) {
					this.priceCent = priceCent;
				}

				public Long getPointsAmount() {
					return this.pointsAmount;
				}

				public void setPointsAmount(Long pointsAmount) {
					this.pointsAmount = pointsAmount;
				}

				public Long getPoints() {
					return this.points;
				}

				public void setPoints(Long points) {
					this.points = points;
				}

				public Long getPointPrice() {
					return this.pointPrice;
				}

				public void setPointPrice(Long pointPrice) {
					this.pointPrice = pointPrice;
				}

				public String getShowName() {
					return this.showName;
				}

				public void setShowName(String showName) {
					this.showName = showName;
				}

				public String getAccessUrl() {
					return this.accessUrl;
				}

				public void setAccessUrl(String accessUrl) {
					this.accessUrl = accessUrl;
				}

				public String getIcon() {
					return this.icon;
				}

				public void setIcon(String icon) {
					this.icon = icon;
				}

				public List<String> getUserLabelList2() {
					return this.userLabelList2;
				}

				public void setUserLabelList2(List<String> userLabelList2) {
					this.userLabelList2 = userLabelList2;
				}
			}
		}
	}

	@Override
	public QueryBizItemListResponse getInstance(UnmarshallerContext context) {
		return	QueryBizItemListResponseUnmarshaller.unmarshall(this, context);
	}
}
