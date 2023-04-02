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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.GetUpgradeStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUpgradeStatusResponse extends AcsResponse {

	private String error_message;

	private String precheck_report_id;

	private String status;

	private String upgrade_step;

	private Upgrade_task upgrade_task;

	public String getError_message() {
		return this.error_message;
	}

	public void setError_message(String error_message) {
		this.error_message = error_message;
	}

	public String getPrecheck_report_id() {
		return this.precheck_report_id;
	}

	public void setPrecheck_report_id(String precheck_report_id) {
		this.precheck_report_id = precheck_report_id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpgrade_step() {
		return this.upgrade_step;
	}

	public void setUpgrade_step(String upgrade_step) {
		this.upgrade_step = upgrade_step;
	}

	public Upgrade_task getUpgrade_task() {
		return this.upgrade_task;
	}

	public void setUpgrade_task(Upgrade_task upgrade_task) {
		this.upgrade_task = upgrade_task;
	}

	public static class Upgrade_task {

		private String status;

		private String message;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public GetUpgradeStatusResponse getInstance(UnmarshallerContext context) {
		return	GetUpgradeStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
