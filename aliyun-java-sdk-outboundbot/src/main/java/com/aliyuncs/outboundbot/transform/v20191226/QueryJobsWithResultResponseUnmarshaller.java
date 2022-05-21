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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs.Job;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs.Job.LatestTask;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs.Job.LatestTask.Contact;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs.Job.LatestTask.ExceptionCode;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs.Job.LatestTask.Extra;
import com.aliyuncs.outboundbot.model.v20191226.QueryJobsWithResultResponse.Jobs.Job.LatestTask.TagHit;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryJobsWithResultResponseUnmarshaller {

	public static QueryJobsWithResultResponse unmarshall(QueryJobsWithResultResponse queryJobsWithResultResponse, UnmarshallerContext _ctx) {
		
		queryJobsWithResultResponse.setRequestId(_ctx.stringValue("QueryJobsWithResultResponse.RequestId"));
		queryJobsWithResultResponse.setHttpStatusCode(_ctx.integerValue("QueryJobsWithResultResponse.HttpStatusCode"));
		queryJobsWithResultResponse.setCode(_ctx.stringValue("QueryJobsWithResultResponse.Code"));
		queryJobsWithResultResponse.setMessage(_ctx.stringValue("QueryJobsWithResultResponse.Message"));
		queryJobsWithResultResponse.setSuccess(_ctx.booleanValue("QueryJobsWithResultResponse.Success"));

		List<String> variableNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryJobsWithResultResponse.VariableNames.Length"); i++) {
			variableNames.add(_ctx.stringValue("QueryJobsWithResultResponse.VariableNames["+ i +"]"));
		}
		queryJobsWithResultResponse.setVariableNames(variableNames);

		Jobs jobs = new Jobs();
		jobs.setPageNumber(_ctx.integerValue("QueryJobsWithResultResponse.Jobs.PageNumber"));
		jobs.setPageSize(_ctx.integerValue("QueryJobsWithResultResponse.Jobs.PageSize"));
		jobs.setPageCount(_ctx.integerValue("QueryJobsWithResultResponse.Jobs.PageCount"));
		jobs.setRowCount(_ctx.integerValue("QueryJobsWithResultResponse.Jobs.RowCount"));

		List<Job> list = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("QueryJobsWithResultResponse.Jobs.List.Length"); i++) {
			Job job = new Job();
			job.setStatus(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].Status"));
			job.setStatusName(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].StatusName"));
			job.setJobFailureReason(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].JobFailureReason"));
			job.setId(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].Id"));

			LatestTask latestTask = new LatestTask();
			latestTask.setStatus(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Status"));
			latestTask.setTaskEndReason(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.TaskEndReason"));
			latestTask.setHasAnswered(_ctx.booleanValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.HasAnswered"));
			latestTask.setCallDuration(_ctx.integerValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.CallDuration"));
			latestTask.setHasReachedEndOfFlow(_ctx.booleanValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.HasReachedEndOfFlow"));
			latestTask.setStatusName(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.StatusName"));
			latestTask.setCallTime(_ctx.longValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.CallTime"));
			latestTask.setCallDurationDisplay(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.CallDurationDisplay"));
			latestTask.setHasHangUpByRejection(_ctx.booleanValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.HasHangUpByRejection"));
			latestTask.setHasLastPlaybackCompleted(_ctx.booleanValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.HasLastPlaybackCompleted"));

			Contact contact = new Contact();
			contact.setRound(_ctx.integerValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.Round"));
			contact.setJobUuid(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.JobUuid"));
			contact.setPreferredPhoneNumber(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.PreferredPhoneNumber"));
			contact.setPhoneNumber(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.PhoneNumber"));
			contact.setState(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.State"));
			contact.setHonorific(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.Honorific"));
			contact.setName(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.Name"));
			contact.setRole(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.Role"));
			contact.setId(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.Id"));
			contact.setReferenceId(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Contact.ReferenceId"));
			latestTask.setContact(contact);

			List<Extra> extras = new ArrayList<Extra>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Extras.Length"); j++) {
				Extra extra = new Extra();
				extra.setKey(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Extras["+ j +"].Key"));
				extra.setValue(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.Extras["+ j +"].Value"));

				extras.add(extra);
			}
			latestTask.setExtras(extras);

			List<TagHit> tagHits = new ArrayList<TagHit>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.TagHits.Length"); j++) {
				TagHit tagHit = new TagHit();
				tagHit.setTagName(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.TagHits["+ j +"].TagName"));
				tagHit.setTagGroup(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.TagHits["+ j +"].TagGroup"));

				tagHits.add(tagHit);
			}
			latestTask.setTagHits(tagHits);

			List<ExceptionCode> dialExceptionCodes = new ArrayList<ExceptionCode>();
			for (int j = 0; j < _ctx.lengthValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.DialExceptionCodes.Length"); j++) {
				ExceptionCode exceptionCode = new ExceptionCode();
				exceptionCode.setCode(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.DialExceptionCodes["+ j +"].Code"));
				exceptionCode.setHint(_ctx.stringValue("QueryJobsWithResultResponse.Jobs.List["+ i +"].LatestTask.DialExceptionCodes["+ j +"].Hint"));

				dialExceptionCodes.add(exceptionCode);
			}
			latestTask.setDialExceptionCodes(dialExceptionCodes);
			job.setLatestTask(latestTask);

			list.add(job);
		}
		jobs.setList(list);
		queryJobsWithResultResponse.setJobs(jobs);
	 
	 	return queryJobsWithResultResponse;
	}
}