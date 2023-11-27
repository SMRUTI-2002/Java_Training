-- Display Agents who did policies means which agentId excities in agent and
-- AgentPolicy Table 

select * from Agent where agentId = ANY(select AgentId from AgentPolicy);

-- Display Idle Agents (which is Agent table not in AgentPolicy table)

select * from Agent where AgentID <> ALL(select AgentId from AgentPolicy);

-- Display Matching Policies (which policyId exists in policy and AgentPolicy tables)

-- Display Idle policies (which exists in policy but not in AgentPolicy)

select * from policy where policyId  = ANY(select AgentId from AgentPolicy);
