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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.FindImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindImagesResponse extends AcsResponse {

	private String requestId;

	private String nextMarker;

	private String setId;

	private List<ImagesItem> images;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public List<ImagesItem> getImages() {
		return this.images;
	}

	public void setImages(List<ImagesItem> images) {
		this.images = images;
	}

	public static class ImagesItem {

		private String croppingSuggestionStatus;

		private String imageQualityModifyTime;

		private String tagsFailReason;

		private String remarksC;

		private String createTime;

		private String sourceType;

		private String facesFailReason;

		private String facesModifyTime;

		private String imageTime;

		private String oCRModifyTime;

		private String addressModifyTime;

		private String imageQualityFailReason;

		private String facesStatus;

		private Integer imageHeight;

		private String remarksArrayA;

		private String externalId;

		private String sourceUri;

		private String modifyTime;

		private Integer fileSize;

		private String sourcePosition;

		private String imageQualityStatus;

		private String oCRFailReason;

		private String addressFailReason;

		private String croppingSuggestionModifyTime;

		private String imageFormat;

		private Integer imageWidth;

		private String remarksArrayB;

		private String orientation;

		private String remarksD;

		private String tagsStatus;

		private String croppingSuggestionFailReason;

		private String remarksA;

		private String imageUri;

		private String tagsModifyTime;

		private String oCRStatus;

		private String addressStatus;

		private String exif;

		private String location;

		private String remarksB;

		private List<TagsItem> tags;

		private List<OCRItem> oCR;

		private List<FacesItem> faces;

		private List<CroppingSuggestionItem> croppingSuggestion;

		private Address address;

		private ImageQuality imageQuality;

		public String getCroppingSuggestionStatus() {
			return this.croppingSuggestionStatus;
		}

		public void setCroppingSuggestionStatus(String croppingSuggestionStatus) {
			this.croppingSuggestionStatus = croppingSuggestionStatus;
		}

		public String getImageQualityModifyTime() {
			return this.imageQualityModifyTime;
		}

		public void setImageQualityModifyTime(String imageQualityModifyTime) {
			this.imageQualityModifyTime = imageQualityModifyTime;
		}

		public String getTagsFailReason() {
			return this.tagsFailReason;
		}

		public void setTagsFailReason(String tagsFailReason) {
			this.tagsFailReason = tagsFailReason;
		}

		public String getRemarksC() {
			return this.remarksC;
		}

		public void setRemarksC(String remarksC) {
			this.remarksC = remarksC;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getFacesFailReason() {
			return this.facesFailReason;
		}

		public void setFacesFailReason(String facesFailReason) {
			this.facesFailReason = facesFailReason;
		}

		public String getFacesModifyTime() {
			return this.facesModifyTime;
		}

		public void setFacesModifyTime(String facesModifyTime) {
			this.facesModifyTime = facesModifyTime;
		}

		public String getImageTime() {
			return this.imageTime;
		}

		public void setImageTime(String imageTime) {
			this.imageTime = imageTime;
		}

		public String getOCRModifyTime() {
			return this.oCRModifyTime;
		}

		public void setOCRModifyTime(String oCRModifyTime) {
			this.oCRModifyTime = oCRModifyTime;
		}

		public String getAddressModifyTime() {
			return this.addressModifyTime;
		}

		public void setAddressModifyTime(String addressModifyTime) {
			this.addressModifyTime = addressModifyTime;
		}

		public String getImageQualityFailReason() {
			return this.imageQualityFailReason;
		}

		public void setImageQualityFailReason(String imageQualityFailReason) {
			this.imageQualityFailReason = imageQualityFailReason;
		}

		public String getFacesStatus() {
			return this.facesStatus;
		}

		public void setFacesStatus(String facesStatus) {
			this.facesStatus = facesStatus;
		}

		public Integer getImageHeight() {
			return this.imageHeight;
		}

		public void setImageHeight(Integer imageHeight) {
			this.imageHeight = imageHeight;
		}

		public String getRemarksArrayA() {
			return this.remarksArrayA;
		}

		public void setRemarksArrayA(String remarksArrayA) {
			this.remarksArrayA = remarksArrayA;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getSourceUri() {
			return this.sourceUri;
		}

		public void setSourceUri(String sourceUri) {
			this.sourceUri = sourceUri;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}

		public String getSourcePosition() {
			return this.sourcePosition;
		}

		public void setSourcePosition(String sourcePosition) {
			this.sourcePosition = sourcePosition;
		}

		public String getImageQualityStatus() {
			return this.imageQualityStatus;
		}

		public void setImageQualityStatus(String imageQualityStatus) {
			this.imageQualityStatus = imageQualityStatus;
		}

		public String getOCRFailReason() {
			return this.oCRFailReason;
		}

		public void setOCRFailReason(String oCRFailReason) {
			this.oCRFailReason = oCRFailReason;
		}

		public String getAddressFailReason() {
			return this.addressFailReason;
		}

		public void setAddressFailReason(String addressFailReason) {
			this.addressFailReason = addressFailReason;
		}

		public String getCroppingSuggestionModifyTime() {
			return this.croppingSuggestionModifyTime;
		}

		public void setCroppingSuggestionModifyTime(String croppingSuggestionModifyTime) {
			this.croppingSuggestionModifyTime = croppingSuggestionModifyTime;
		}

		public String getImageFormat() {
			return this.imageFormat;
		}

		public void setImageFormat(String imageFormat) {
			this.imageFormat = imageFormat;
		}

		public Integer getImageWidth() {
			return this.imageWidth;
		}

		public void setImageWidth(Integer imageWidth) {
			this.imageWidth = imageWidth;
		}

		public String getRemarksArrayB() {
			return this.remarksArrayB;
		}

		public void setRemarksArrayB(String remarksArrayB) {
			this.remarksArrayB = remarksArrayB;
		}

		public String getOrientation() {
			return this.orientation;
		}

		public void setOrientation(String orientation) {
			this.orientation = orientation;
		}

		public String getRemarksD() {
			return this.remarksD;
		}

		public void setRemarksD(String remarksD) {
			this.remarksD = remarksD;
		}

		public String getTagsStatus() {
			return this.tagsStatus;
		}

		public void setTagsStatus(String tagsStatus) {
			this.tagsStatus = tagsStatus;
		}

		public String getCroppingSuggestionFailReason() {
			return this.croppingSuggestionFailReason;
		}

		public void setCroppingSuggestionFailReason(String croppingSuggestionFailReason) {
			this.croppingSuggestionFailReason = croppingSuggestionFailReason;
		}

		public String getRemarksA() {
			return this.remarksA;
		}

		public void setRemarksA(String remarksA) {
			this.remarksA = remarksA;
		}

		public String getImageUri() {
			return this.imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public String getTagsModifyTime() {
			return this.tagsModifyTime;
		}

		public void setTagsModifyTime(String tagsModifyTime) {
			this.tagsModifyTime = tagsModifyTime;
		}

		public String getOCRStatus() {
			return this.oCRStatus;
		}

		public void setOCRStatus(String oCRStatus) {
			this.oCRStatus = oCRStatus;
		}

		public String getAddressStatus() {
			return this.addressStatus;
		}

		public void setAddressStatus(String addressStatus) {
			this.addressStatus = addressStatus;
		}

		public String getExif() {
			return this.exif;
		}

		public void setExif(String exif) {
			this.exif = exif;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getRemarksB() {
			return this.remarksB;
		}

		public void setRemarksB(String remarksB) {
			this.remarksB = remarksB;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<OCRItem> getOCR() {
			return this.oCR;
		}

		public void setOCR(List<OCRItem> oCR) {
			this.oCR = oCR;
		}

		public List<FacesItem> getFaces() {
			return this.faces;
		}

		public void setFaces(List<FacesItem> faces) {
			this.faces = faces;
		}

		public List<CroppingSuggestionItem> getCroppingSuggestion() {
			return this.croppingSuggestion;
		}

		public void setCroppingSuggestion(List<CroppingSuggestionItem> croppingSuggestion) {
			this.croppingSuggestion = croppingSuggestion;
		}

		public Address getAddress() {
			return this.address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public ImageQuality getImageQuality() {
			return this.imageQuality;
		}

		public void setImageQuality(ImageQuality imageQuality) {
			this.imageQuality = imageQuality;
		}

		public static class TagsItem {

			private Float tagConfidence;

			private Float centricScore;

			private String tagName;

			private Integer tagLevel;

			private String parentTagName;

			public Float getTagConfidence() {
				return this.tagConfidence;
			}

			public void setTagConfidence(Float tagConfidence) {
				this.tagConfidence = tagConfidence;
			}

			public Float getCentricScore() {
				return this.centricScore;
			}

			public void setCentricScore(Float centricScore) {
				this.centricScore = centricScore;
			}

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public Integer getTagLevel() {
				return this.tagLevel;
			}

			public void setTagLevel(Integer tagLevel) {
				this.tagLevel = tagLevel;
			}

			public String getParentTagName() {
				return this.parentTagName;
			}

			public void setParentTagName(String parentTagName) {
				this.parentTagName = parentTagName;
			}
		}

		public static class OCRItem {

			private Float oCRConfidence;

			private String oCRContents;

			private OCRBoundary oCRBoundary;

			public Float getOCRConfidence() {
				return this.oCRConfidence;
			}

			public void setOCRConfidence(Float oCRConfidence) {
				this.oCRConfidence = oCRConfidence;
			}

			public String getOCRContents() {
				return this.oCRContents;
			}

			public void setOCRContents(String oCRContents) {
				this.oCRContents = oCRContents;
			}

			public OCRBoundary getOCRBoundary() {
				return this.oCRBoundary;
			}

			public void setOCRBoundary(OCRBoundary oCRBoundary) {
				this.oCRBoundary = oCRBoundary;
			}

			public static class OCRBoundary {

				private Integer top;

				private Integer width;

				private Integer height;

				private Integer left;

				public Integer getTop() {
					return this.top;
				}

				public void setTop(Integer top) {
					this.top = top;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}

				public Integer getLeft() {
					return this.left;
				}

				public void setLeft(Integer left) {
					this.left = left;
				}
			}
		}

		public static class FacesItem {

			private String gender;

			private String faceId;

			private Float genderConfidence;

			private Float faceQuality;

			private String emotion;

			private Integer age;

			private Float faceConfidence;

			private Float emotionConfidence;

			private Float attractive;

			private String groupId;

			private FaceAttributes faceAttributes;

			private EmotionDetails emotionDetails;

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public Float getGenderConfidence() {
				return this.genderConfidence;
			}

			public void setGenderConfidence(Float genderConfidence) {
				this.genderConfidence = genderConfidence;
			}

			public Float getFaceQuality() {
				return this.faceQuality;
			}

			public void setFaceQuality(Float faceQuality) {
				this.faceQuality = faceQuality;
			}

			public String getEmotion() {
				return this.emotion;
			}

			public void setEmotion(String emotion) {
				this.emotion = emotion;
			}

			public Integer getAge() {
				return this.age;
			}

			public void setAge(Integer age) {
				this.age = age;
			}

			public Float getFaceConfidence() {
				return this.faceConfidence;
			}

			public void setFaceConfidence(Float faceConfidence) {
				this.faceConfidence = faceConfidence;
			}

			public Float getEmotionConfidence() {
				return this.emotionConfidence;
			}

			public void setEmotionConfidence(Float emotionConfidence) {
				this.emotionConfidence = emotionConfidence;
			}

			public Float getAttractive() {
				return this.attractive;
			}

			public void setAttractive(Float attractive) {
				this.attractive = attractive;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public FaceAttributes getFaceAttributes() {
				return this.faceAttributes;
			}

			public void setFaceAttributes(FaceAttributes faceAttributes) {
				this.faceAttributes = faceAttributes;
			}

			public EmotionDetails getEmotionDetails() {
				return this.emotionDetails;
			}

			public void setEmotionDetails(EmotionDetails emotionDetails) {
				this.emotionDetails = emotionDetails;
			}

			public static class FaceAttributes {

				private Float glassesConfidence;

				private String glasses;

				private String mask;

				private Float beardConfidence;

				private Float maskConfidence;

				private String beard;

				private FaceBoundary faceBoundary;

				private HeadPose headPose;

				public Float getGlassesConfidence() {
					return this.glassesConfidence;
				}

				public void setGlassesConfidence(Float glassesConfidence) {
					this.glassesConfidence = glassesConfidence;
				}

				public String getGlasses() {
					return this.glasses;
				}

				public void setGlasses(String glasses) {
					this.glasses = glasses;
				}

				public String getMask() {
					return this.mask;
				}

				public void setMask(String mask) {
					this.mask = mask;
				}

				public Float getBeardConfidence() {
					return this.beardConfidence;
				}

				public void setBeardConfidence(Float beardConfidence) {
					this.beardConfidence = beardConfidence;
				}

				public Float getMaskConfidence() {
					return this.maskConfidence;
				}

				public void setMaskConfidence(Float maskConfidence) {
					this.maskConfidence = maskConfidence;
				}

				public String getBeard() {
					return this.beard;
				}

				public void setBeard(String beard) {
					this.beard = beard;
				}

				public FaceBoundary getFaceBoundary() {
					return this.faceBoundary;
				}

				public void setFaceBoundary(FaceBoundary faceBoundary) {
					this.faceBoundary = faceBoundary;
				}

				public HeadPose getHeadPose() {
					return this.headPose;
				}

				public void setHeadPose(HeadPose headPose) {
					this.headPose = headPose;
				}

				public static class FaceBoundary {

					private Integer top;

					private Integer width;

					private Integer height;

					private Integer left;

					public Integer getTop() {
						return this.top;
					}

					public void setTop(Integer top) {
						this.top = top;
					}

					public Integer getWidth() {
						return this.width;
					}

					public void setWidth(Integer width) {
						this.width = width;
					}

					public Integer getHeight() {
						return this.height;
					}

					public void setHeight(Integer height) {
						this.height = height;
					}

					public Integer getLeft() {
						return this.left;
					}

					public void setLeft(Integer left) {
						this.left = left;
					}
				}

				public static class HeadPose {

					private Float pitch;

					private Float roll;

					private Float yaw;

					public Float getPitch() {
						return this.pitch;
					}

					public void setPitch(Float pitch) {
						this.pitch = pitch;
					}

					public Float getRoll() {
						return this.roll;
					}

					public void setRoll(Float roll) {
						this.roll = roll;
					}

					public Float getYaw() {
						return this.yaw;
					}

					public void setYaw(Float yaw) {
						this.yaw = yaw;
					}
				}
			}

			public static class EmotionDetails {

				private Float hAPPY;

				private Float sURPRISED;

				private Float cALM;

				private Float dISGUSTED;

				private Float aNGRY;

				private Float sAD;

				private Float sCARED;

				public Float getHAPPY() {
					return this.hAPPY;
				}

				public void setHAPPY(Float hAPPY) {
					this.hAPPY = hAPPY;
				}

				public Float getSURPRISED() {
					return this.sURPRISED;
				}

				public void setSURPRISED(Float sURPRISED) {
					this.sURPRISED = sURPRISED;
				}

				public Float getCALM() {
					return this.cALM;
				}

				public void setCALM(Float cALM) {
					this.cALM = cALM;
				}

				public Float getDISGUSTED() {
					return this.dISGUSTED;
				}

				public void setDISGUSTED(Float dISGUSTED) {
					this.dISGUSTED = dISGUSTED;
				}

				public Float getANGRY() {
					return this.aNGRY;
				}

				public void setANGRY(Float aNGRY) {
					this.aNGRY = aNGRY;
				}

				public Float getSAD() {
					return this.sAD;
				}

				public void setSAD(Float sAD) {
					this.sAD = sAD;
				}

				public Float getSCARED() {
					return this.sCARED;
				}

				public void setSCARED(Float sCARED) {
					this.sCARED = sCARED;
				}
			}
		}

		public static class CroppingSuggestionItem {

			private Float score;

			private String aspectRatio;

			private CroppingBoundary croppingBoundary;

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getAspectRatio() {
				return this.aspectRatio;
			}

			public void setAspectRatio(String aspectRatio) {
				this.aspectRatio = aspectRatio;
			}

			public CroppingBoundary getCroppingBoundary() {
				return this.croppingBoundary;
			}

			public void setCroppingBoundary(CroppingBoundary croppingBoundary) {
				this.croppingBoundary = croppingBoundary;
			}

			public static class CroppingBoundary {

				private Integer top;

				private Integer width;

				private Integer height;

				private Integer left;

				public Integer getTop() {
					return this.top;
				}

				public void setTop(Integer top) {
					this.top = top;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}

				public Integer getLeft() {
					return this.left;
				}

				public void setLeft(Integer left) {
					this.left = left;
				}
			}
		}

		public static class Address {

			private String township;

			private String district;

			private String addressLine;

			private String country;

			private String city;

			private String province;

			public String getTownship() {
				return this.township;
			}

			public void setTownship(String township) {
				this.township = township;
			}

			public String getDistrict() {
				return this.district;
			}

			public void setDistrict(String district) {
				this.district = district;
			}

			public String getAddressLine() {
				return this.addressLine;
			}

			public void setAddressLine(String addressLine) {
				this.addressLine = addressLine;
			}

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}
		}

		public static class ImageQuality {

			private Float overallScore;

			private Float color;

			private Float colorScore;

			private Float contrastScore;

			private Float contrast;

			private Float exposureScore;

			private Float clarityScore;

			private Float clarity;

			private Float exposure;

			private Float compositionScore;

			public Float getOverallScore() {
				return this.overallScore;
			}

			public void setOverallScore(Float overallScore) {
				this.overallScore = overallScore;
			}

			public Float getColor() {
				return this.color;
			}

			public void setColor(Float color) {
				this.color = color;
			}

			public Float getColorScore() {
				return this.colorScore;
			}

			public void setColorScore(Float colorScore) {
				this.colorScore = colorScore;
			}

			public Float getContrastScore() {
				return this.contrastScore;
			}

			public void setContrastScore(Float contrastScore) {
				this.contrastScore = contrastScore;
			}

			public Float getContrast() {
				return this.contrast;
			}

			public void setContrast(Float contrast) {
				this.contrast = contrast;
			}

			public Float getExposureScore() {
				return this.exposureScore;
			}

			public void setExposureScore(Float exposureScore) {
				this.exposureScore = exposureScore;
			}

			public Float getClarityScore() {
				return this.clarityScore;
			}

			public void setClarityScore(Float clarityScore) {
				this.clarityScore = clarityScore;
			}

			public Float getClarity() {
				return this.clarity;
			}

			public void setClarity(Float clarity) {
				this.clarity = clarity;
			}

			public Float getExposure() {
				return this.exposure;
			}

			public void setExposure(Float exposure) {
				this.exposure = exposure;
			}

			public Float getCompositionScore() {
				return this.compositionScore;
			}

			public void setCompositionScore(Float compositionScore) {
				this.compositionScore = compositionScore;
			}
		}
	}

	@Override
	public FindImagesResponse getInstance(UnmarshallerContext context) {
		return	FindImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
