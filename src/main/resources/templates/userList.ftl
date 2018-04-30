<#import "parts/common.ftl" as c />
<@c.page>
    List of users
<table>
    <thead>
        <tr>
            <th>Name</th>
            <th>Role</th>
            <th></th>
        </tr>
    </thead>
</table>
<#list users as user>
    <tr>
        <th>${user.username}</th>
        <th><#list user.roles as role>${role}<#sep>, </#list></th>
        <td><a href="/user{id}">Edit</a></td>
    </tr>

</#list>
</@c.page>