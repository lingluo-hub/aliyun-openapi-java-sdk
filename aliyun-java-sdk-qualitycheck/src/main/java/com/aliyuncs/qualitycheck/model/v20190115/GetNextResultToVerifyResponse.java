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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetNextResultToVerifyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNextResultToVerifyResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer index;

		private Integer status;

		private String audioScheme;

		private String audioURL;

		private String updateTime;

		private Integer incorrectWords;

		private Integer verifiedCount;

		private Boolean verified;

		private String fileName;

		private Integer totalCount;

		private Float precision;

		private String fileId;

		private Integer duration;

		private List<Dialogue> dialogues;

		public Integer getIndex() {
			return this.index;
		}

		public void setIndex(Integer index) {
			this.index = index;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getAudioScheme() {
			return this.audioScheme;
		}

		public void setAudioScheme(String audioScheme) {
			this.audioScheme = audioScheme;
		}

		public String getAudioURL() {
			return this.audioURL;
		}

		public void setAudioURL(String audioURL) {
			this.audioURL = audioURL;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getIncorrectWords() {
			return this.incorrectWords;
		}

		public void setIncorrectWords(Integer incorrectWords) {
			this.incorrectWords = incorrectWords;
		}

		public Integer getVerifiedCount() {
			return this.verifiedCount;
		}

		public void setVerifiedCount(Integer verifiedCount) {
			this.verifiedCount = verifiedCount;
		}

		public Boolean getVerified() {
			return this.verified;
		}

		public void setVerified(Boolean verified) {
			this.verified = verified;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Float getPrecision() {
			return this.precision;
		}

		public void setPrecision(Float precision) {
			this.precision = precision;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public List<Dialogue> getDialogues() {
			return this.dialogues;
		}

		public void setDialogues(List<Dialogue> dialogues) {
			this.dialogues = dialogues;
		}

		public static class Dialogue {

			private String words;

			private String identity;

			private Integer incorrectWords;

			private String beginTime;

			private String sourceWords;

			private Long end;

			private Integer speechRate;

			private String hourMinSec;

			private String sourceRole;

			private Long begin;

			private Integer emotionValue;

			private String role;

			private Integer silenceDuration;

			private List<Delta> deltas;

			public String getWords() {
				return this.words;
			}

			public void setWords(String words) {
				this.words = words;
			}

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}

			public Integer getIncorrectWords() {
				return this.incorrectWords;
			}

			public void setIncorrectWords(Integer incorrectWords) {
				this.incorrectWords = incorrectWords;
			}

			public String getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(String beginTime) {
				this.beginTime = beginTime;
			}

			public String getSourceWords() {
				return this.sourceWords;
			}

			public void setSourceWords(String sourceWords) {
				this.sourceWords = sourceWords;
			}

			public Long getEnd() {
				return this.end;
			}

			public void setEnd(Long end) {
				this.end = end;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getHourMinSec() {
				return this.hourMinSec;
			}

			public void setHourMinSec(String hourMinSec) {
				this.hourMinSec = hourMinSec;
			}

			public String getSourceRole() {
				return this.sourceRole;
			}

			public void setSourceRole(String sourceRole) {
				this.sourceRole = sourceRole;
			}

			public Long getBegin() {
				return this.begin;
			}

			public void setBegin(Long begin) {
				this.begin = begin;
			}

			public Integer getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(Integer emotionValue) {
				this.emotionValue = emotionValue;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Integer silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public List<Delta> getDeltas() {
				return this.deltas;
			}

			public void setDeltas(List<Delta> deltas) {
				this.deltas = deltas;
			}

			public static class Delta {

				private String type;

				private Source source;

				private Target target;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Source getSource() {
					return this.source;
				}

				public void setSource(Source source) {
					this.source = source;
				}

				public Target getTarget() {
					return this.target;
				}

				public void setTarget(Target target) {
					this.target = target;
				}

				public static class Source {

					private Integer position;

					private List<String> line;

					public Integer getPosition() {
						return this.position;
					}

					public void setPosition(Integer position) {
						this.position = position;
					}

					public List<String> getLine() {
						return this.line;
					}

					public void setLine(List<String> line) {
						this.line = line;
					}
				}

				public static class Target {

					private Integer position;

					private List<String> line1;

					public Integer getPosition() {
						return this.position;
					}

					public void setPosition(Integer position) {
						this.position = position;
					}

					public List<String> getLine1() {
						return this.line1;
					}

					public void setLine1(List<String> line1) {
						this.line1 = line1;
					}
				}
			}
		}
	}

	@Override
	public GetNextResultToVerifyResponse getInstance(UnmarshallerContext context) {
		return	GetNextResultToVerifyResponseUnmarshaller.unmarshall(this, context);
	}
}
