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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Badges;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Creator;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Customfield;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Customfield.ValueInfo;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Executor;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Involver;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Reminder;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Scenariofieldconfig;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Stage;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Subtask;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.SubtaskCount;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Taskflowstatus;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.Tasklist;
import com.aliyuncs.devops_rdc.model.v20200303.GetTaskDetailBaseResponse.Object.WorkTime;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskDetailBaseResponseUnmarshaller {

	public static GetTaskDetailBaseResponse unmarshall(GetTaskDetailBaseResponse getTaskDetailBaseResponse, UnmarshallerContext _ctx) {
		
		getTaskDetailBaseResponse.setRequestId(_ctx.stringValue("GetTaskDetailBaseResponse.RequestId"));
		getTaskDetailBaseResponse.setErrorMsg(_ctx.stringValue("GetTaskDetailBaseResponse.ErrorMsg"));
		getTaskDetailBaseResponse.setSuccessful(_ctx.booleanValue("GetTaskDetailBaseResponse.Successful"));
		getTaskDetailBaseResponse.setErrorCode(_ctx.stringValue("GetTaskDetailBaseResponse.ErrorCode"));

		Object object = new Object();
		object.setIsFavorite(_ctx.booleanValue("GetTaskDetailBaseResponse.Object.IsFavorite"));
		object.setOrganization(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Organization"));
		object.setExecutorId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.ExecutorId"));
		object.setScenariofieldconfigId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.ScenariofieldconfigId"));
		object.setProjectId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.ProjectId"));
		object.setIsTopInProject(_ctx.booleanValue("GetTaskDetailBaseResponse.Object.IsTopInProject"));
		object.setPriority(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Priority"));
		object.setShareStatus(_ctx.integerValue("GetTaskDetailBaseResponse.Object.ShareStatus"));
		object.setAccomplished(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Accomplished"));
		object.setTaskflowstatusId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.TaskflowstatusId"));
		object.setNote(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Note"));
		object.setUpdated(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Updated"));
		object.setUniqueId(_ctx.integerValue("GetTaskDetailBaseResponse.Object.UniqueId"));
		object.setIsArchived(_ctx.booleanValue("GetTaskDetailBaseResponse.Object.IsArchived"));
		object.setContent(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Content"));
		object.setCommentsCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.CommentsCount"));
		object.setRating(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Rating"));
		object.setRecurrence(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Recurrence"));
		object.setObjectType(_ctx.stringValue("GetTaskDetailBaseResponse.Object.ObjectType"));
		object.setProgress(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Progress"));
		object.setUntilDate(_ctx.stringValue("GetTaskDetailBaseResponse.Object.UntilDate"));
		object.setStartDate(_ctx.stringValue("GetTaskDetailBaseResponse.Object.StartDate"));
		object.setStoryPoint(_ctx.stringValue("GetTaskDetailBaseResponse.Object.StoryPoint"));
		object.setObjectlinksCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.ObjectlinksCount"));
		object.setSprint(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Sprint"));
		object.setCreatorId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.CreatorId"));
		object.setSource(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Source"));
		object.setSourceId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.SourceId"));
		object.setOrganizationId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.OrganizationId"));
		object.setSourceDate(_ctx.stringValue("GetTaskDetailBaseResponse.Object.SourceDate"));
		object.setLikesCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.LikesCount"));
		object.setStageId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.StageId"));
		object.setVisible(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Visible"));
		object.setIsDone(_ctx.booleanValue("GetTaskDetailBaseResponse.Object.IsDone"));
		object.setParent(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Parent"));
		object.setSprintId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.SprintId"));
		object.setAttachmentsCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.AttachmentsCount"));
		object.setDueDate(_ctx.stringValue("GetTaskDetailBaseResponse.Object.DueDate"));
		object.setCreated(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Created"));
		object.setTaskId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.TaskId"));
		object.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Id"));

		List<String> labels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Labels.Length"); i++) {
			labels.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Labels["+ i +"]"));
		}
		object.setLabels(labels);

		List<String> divisions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Divisions.Length"); i++) {
			divisions.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Divisions["+ i +"]"));
		}
		object.setDivisions(divisions);

		List<String> ancestors = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Ancestors.Length"); i++) {
			ancestors.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Ancestors["+ i +"]"));
		}
		object.setAncestors(ancestors);

		List<String> involveMembers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.InvolveMembers.Length"); i++) {
			involveMembers.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.InvolveMembers["+ i +"]"));
		}
		object.setInvolveMembers(involveMembers);

		List<String> tagIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.TagIds.Length"); i++) {
			tagIds.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.TagIds["+ i +"]"));
		}
		object.setTagIds(tagIds);

		List<String> ancestorIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.AncestorIds.Length"); i++) {
			ancestorIds.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.AncestorIds["+ i +"]"));
		}
		object.setAncestorIds(ancestorIds);

		Scenariofieldconfig scenariofieldconfig = new Scenariofieldconfig();
		scenariofieldconfig.setIcon(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Scenariofieldconfig.Icon"));
		scenariofieldconfig.setProTemplateConfigType(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Scenariofieldconfig.ProTemplateConfigType"));
		scenariofieldconfig.setName(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Scenariofieldconfig.Name"));
		scenariofieldconfig.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Scenariofieldconfig.Id"));
		object.setScenariofieldconfig(scenariofieldconfig);

		Executor executor = new Executor();
		executor.setAvatarUrl(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Executor.AvatarUrl"));
		executor.setName(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Executor.Name"));
		executor.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Executor.Id"));
		object.setExecutor(executor);

		Tasklist tasklist = new Tasklist();
		tasklist.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Tasklist.Id"));
		tasklist.setTitle(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Tasklist.Title"));
		object.setTasklist(tasklist);

		Taskflowstatus taskflowstatus = new Taskflowstatus();
		taskflowstatus.setTaskflowId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Taskflowstatus.TaskflowId"));
		taskflowstatus.setName(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Taskflowstatus.Name"));
		taskflowstatus.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Taskflowstatus.Id"));
		taskflowstatus.setKind(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Taskflowstatus.Kind"));
		object.setTaskflowstatus(taskflowstatus);

		Creator creator = new Creator();
		creator.setName(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Creator.Name"));
		creator.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Creator.Id"));
		object.setCreator(creator);

		Reminder reminder = new Reminder();
		reminder.setType(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.Type"));
		reminder.setDate(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.Date"));
		reminder.setBizMethod(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.Method"));
		reminder.setCreatorId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.CreatorId"));

		List<String> memberRoles = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Reminder.MemberRoles.Length"); i++) {
			memberRoles.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.MemberRoles["+ i +"]"));
		}
		reminder.setMemberRoles(memberRoles);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Reminder.Members.Length"); i++) {
			members.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.Members["+ i +"]"));
		}
		reminder.setMembers(members);

		List<String> rules = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Reminder.Rules.Length"); i++) {
			rules.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Reminder.Rules["+ i +"]"));
		}
		reminder.setRules(rules);
		object.setReminder(reminder);

		SubtaskCount subtaskCount = new SubtaskCount();
		subtaskCount.setDone(_ctx.integerValue("GetTaskDetailBaseResponse.Object.SubtaskCount.Done"));
		subtaskCount.setTotal(_ctx.integerValue("GetTaskDetailBaseResponse.Object.SubtaskCount.Total"));
		object.setSubtaskCount(subtaskCount);

		WorkTime workTime = new WorkTime();
		workTime.setUsedTime(_ctx.integerValue("GetTaskDetailBaseResponse.Object.WorkTime.UsedTime"));
		workTime.setTotalTime(_ctx.integerValue("GetTaskDetailBaseResponse.Object.WorkTime.TotalTime"));
		workTime.setUnit(_ctx.stringValue("GetTaskDetailBaseResponse.Object.WorkTime.Unit"));
		object.setWorkTime(workTime);

		Badges badges = new Badges();
		badges.setLikesCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Badges.LikesCount"));
		badges.setObjectlinksCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Badges.ObjectlinksCount"));
		badges.setAttachmentsCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Badges.AttachmentsCount"));
		badges.setCommentsCount(_ctx.integerValue("GetTaskDetailBaseResponse.Object.Badges.CommentsCount"));
		object.setBadges(badges);

		Stage stage = new Stage();
		stage.setName(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Stage.Name"));
		stage.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Stage.Id"));
		object.setStage(stage);

		List<Customfield> customfields = new ArrayList<Customfield>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Customfields.Length"); i++) {
			Customfield customfield = new Customfield();
			customfield.setType(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].Type"));
			customfield.setCustomfieldId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].CustomfieldId"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].Values["+ j +"]"));
			}
			customfield.setValues(values);

			List<ValueInfo> value = new ArrayList<ValueInfo>();
			for (int j = 0; j < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].Value.Length"); j++) {
				ValueInfo valueInfo = new ValueInfo();
				valueInfo.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].Value["+ j +"].Id"));
				valueInfo.setTitle(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Customfields["+ i +"].Value["+ j +"].Title"));

				value.add(valueInfo);
			}
			customfield.setValue(value);

			customfields.add(customfield);
		}
		object.setCustomfields(customfields);

		List<Subtask> subtasks = new ArrayList<Subtask>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Subtasks.Length"); i++) {
			Subtask subtask = new Subtask();
			subtask.setContent(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Subtasks["+ i +"].Content"));
			subtask.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Subtasks["+ i +"].Id"));

			subtasks.add(subtask);
		}
		object.setSubtasks(subtasks);

		List<Involver> involvers = new ArrayList<Involver>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskDetailBaseResponse.Object.Involvers.Length"); i++) {
			Involver involver = new Involver();
			involver.setName(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Involvers["+ i +"].Name"));
			involver.setId(_ctx.stringValue("GetTaskDetailBaseResponse.Object.Involvers["+ i +"].Id"));

			involvers.add(involver);
		}
		object.setInvolvers(involvers);
		getTaskDetailBaseResponse.setObject(object);
	 
	 	return getTaskDetailBaseResponse;
	}
}