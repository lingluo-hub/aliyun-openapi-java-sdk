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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeIdentityCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeIdentityCardResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private BackResult backResult;

		private FrontResult frontResult;

		public BackResult getBackResult() {
			return this.backResult;
		}

		public void setBackResult(BackResult backResult) {
			this.backResult = backResult;
		}

		public FrontResult getFrontResult() {
			return this.frontResult;
		}

		public void setFrontResult(FrontResult frontResult) {
			this.frontResult = frontResult;
		}

		public static class BackResult {

			private String endDate;

			private String issue;

			private String startDate;

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getIssue() {
				return this.issue;
			}

			public void setIssue(String issue) {
				this.issue = issue;
			}

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}
		}

		public static class FrontResult {

			private String birthDate;

			private String gender;

			private String address;

			private String nationality;

			private String name;

			private String iDNumber;

			private List<FaceRectVertice> faceRectVertices;

			private List<CardArea> cardAreas;

			private FaceRectangle faceRectangle;

			public String getBirthDate() {
				return this.birthDate;
			}

			public void setBirthDate(String birthDate) {
				this.birthDate = birthDate;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getNationality() {
				return this.nationality;
			}

			public void setNationality(String nationality) {
				this.nationality = nationality;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getIDNumber() {
				return this.iDNumber;
			}

			public void setIDNumber(String iDNumber) {
				this.iDNumber = iDNumber;
			}

			public List<FaceRectVertice> getFaceRectVertices() {
				return this.faceRectVertices;
			}

			public void setFaceRectVertices(List<FaceRectVertice> faceRectVertices) {
				this.faceRectVertices = faceRectVertices;
			}

			public List<CardArea> getCardAreas() {
				return this.cardAreas;
			}

			public void setCardAreas(List<CardArea> cardAreas) {
				this.cardAreas = cardAreas;
			}

			public FaceRectangle getFaceRectangle() {
				return this.faceRectangle;
			}

			public void setFaceRectangle(FaceRectangle faceRectangle) {
				this.faceRectangle = faceRectangle;
			}

			public static class FaceRectVertice {

				private Float y;

				private Float x;

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}
			}

			public static class CardArea {

				private Float y;

				private Float x;

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}
			}

			public static class FaceRectangle {

				private Float angle;

				private Size size;

				private Center center;

				public Float getAngle() {
					return this.angle;
				}

				public void setAngle(Float angle) {
					this.angle = angle;
				}

				public Size getSize() {
					return this.size;
				}

				public void setSize(Size size) {
					this.size = size;
				}

				public Center getCenter() {
					return this.center;
				}

				public void setCenter(Center center) {
					this.center = center;
				}

				public static class Size {

					private Float width;

					private Float height;

					public Float getWidth() {
						return this.width;
					}

					public void setWidth(Float width) {
						this.width = width;
					}

					public Float getHeight() {
						return this.height;
					}

					public void setHeight(Float height) {
						this.height = height;
					}
				}

				public static class Center {

					private Float y;

					private Float x;

					public Float getY() {
						return this.y;
					}

					public void setY(Float y) {
						this.y = y;
					}

					public Float getX() {
						return this.x;
					}

					public void setX(Float x) {
						this.x = x;
					}
				}
			}
		}
	}

	@Override
	public RecognizeIdentityCardResponse getInstance(UnmarshallerContext context) {
		return	RecognizeIdentityCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
