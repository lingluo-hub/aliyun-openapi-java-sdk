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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.UpdateStackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateStackResponse extends AcsResponse {

	private String requestId;

	private String stackId;

	private DryRunResult dryRunResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public DryRunResult getDryRunResult() {
		return this.dryRunResult;
	}

	public void setDryRunResult(DryRunResult dryRunResult) {
		this.dryRunResult = dryRunResult;
	}

	public static class DryRunResult {

		private List<String> parametersAllowedToBeModified;

		private List<String> parametersConditionallyAllowedToBeModified;

		private List<String> parametersUncertainlyAllowedToBeModified;

		private List<String> parametersNotAllowedToBeModified;

		private List<String> parametersCauseInterruptionIfModified;

		private List<String> parametersConditionallyCauseInterruptionIfModified;

		private List<String> parametersUncertainlyCauseInterruptionIfModified;

		public List<String> getParametersAllowedToBeModified() {
			return this.parametersAllowedToBeModified;
		}

		public void setParametersAllowedToBeModified(List<String> parametersAllowedToBeModified) {
			this.parametersAllowedToBeModified = parametersAllowedToBeModified;
		}

		public List<String> getParametersConditionallyAllowedToBeModified() {
			return this.parametersConditionallyAllowedToBeModified;
		}

		public void setParametersConditionallyAllowedToBeModified(List<String> parametersConditionallyAllowedToBeModified) {
			this.parametersConditionallyAllowedToBeModified = parametersConditionallyAllowedToBeModified;
		}

		public List<String> getParametersUncertainlyAllowedToBeModified() {
			return this.parametersUncertainlyAllowedToBeModified;
		}

		public void setParametersUncertainlyAllowedToBeModified(List<String> parametersUncertainlyAllowedToBeModified) {
			this.parametersUncertainlyAllowedToBeModified = parametersUncertainlyAllowedToBeModified;
		}

		public List<String> getParametersNotAllowedToBeModified() {
			return this.parametersNotAllowedToBeModified;
		}

		public void setParametersNotAllowedToBeModified(List<String> parametersNotAllowedToBeModified) {
			this.parametersNotAllowedToBeModified = parametersNotAllowedToBeModified;
		}

		public List<String> getParametersCauseInterruptionIfModified() {
			return this.parametersCauseInterruptionIfModified;
		}

		public void setParametersCauseInterruptionIfModified(List<String> parametersCauseInterruptionIfModified) {
			this.parametersCauseInterruptionIfModified = parametersCauseInterruptionIfModified;
		}

		public List<String> getParametersConditionallyCauseInterruptionIfModified() {
			return this.parametersConditionallyCauseInterruptionIfModified;
		}

		public void setParametersConditionallyCauseInterruptionIfModified(List<String> parametersConditionallyCauseInterruptionIfModified) {
			this.parametersConditionallyCauseInterruptionIfModified = parametersConditionallyCauseInterruptionIfModified;
		}

		public List<String> getParametersUncertainlyCauseInterruptionIfModified() {
			return this.parametersUncertainlyCauseInterruptionIfModified;
		}

		public void setParametersUncertainlyCauseInterruptionIfModified(List<String> parametersUncertainlyCauseInterruptionIfModified) {
			this.parametersUncertainlyCauseInterruptionIfModified = parametersUncertainlyCauseInterruptionIfModified;
		}
	}

	@Override
	public UpdateStackResponse getInstance(UnmarshallerContext context) {
		return	UpdateStackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
