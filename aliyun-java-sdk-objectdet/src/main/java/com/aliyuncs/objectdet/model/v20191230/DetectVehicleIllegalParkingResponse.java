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

package com.aliyuncs.objectdet.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.objectdet.transform.v20191230.DetectVehicleIllegalParkingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectVehicleIllegalParkingResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Element> elements;

		private List<RegionIntersect> regionIntersects;

		public List<Element> getElements() {
			return this.elements;
		}

		public void setElements(List<Element> elements) {
			this.elements = elements;
		}

		public List<RegionIntersect> getRegionIntersects() {
			return this.regionIntersects;
		}

		public void setRegionIntersects(List<RegionIntersect> regionIntersects) {
			this.regionIntersects = regionIntersects;
		}

		public static class Element {

			private Float score;

			private String typeName;

			private Long id;

			private List<BoxesItem> boxes;

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public String getTypeName() {
				return this.typeName;
			}

			public void setTypeName(String typeName) {
				this.typeName = typeName;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public List<BoxesItem> getBoxes() {
				return this.boxes;
			}

			public void setBoxes(List<BoxesItem> boxes) {
				this.boxes = boxes;
			}

			public static class BoxesItem {

				private Long left;

				private Long top;

				private Long right;

				private Long bottom;

				public Long getLeft() {
					return this.left;
				}

				public void setLeft(Long left) {
					this.left = left;
				}

				public Long getTop() {
					return this.top;
				}

				public void setTop(Long top) {
					this.top = top;
				}

				public Long getRight() {
					return this.right;
				}

				public void setRight(Long right) {
					this.right = right;
				}

				public Long getBottom() {
					return this.bottom;
				}

				public void setBottom(Long bottom) {
					this.bottom = bottom;
				}
			}
		}

		public static class RegionIntersect {

			private List<Long> ids;

			public List<Long> getIds() {
				return this.ids;
			}

			public void setIds(List<Long> ids) {
				this.ids = ids;
			}
		}
	}

	@Override
	public DetectVehicleIllegalParkingResponse getInstance(UnmarshallerContext context) {
		return	DetectVehicleIllegalParkingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
