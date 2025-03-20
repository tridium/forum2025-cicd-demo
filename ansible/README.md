# Instructions

The following demonstrates some sample ansible scripts that can be used to help automate the creation of github runners used for building your modules. They should be tweaked and adjusted to match your environment.

## Create Credentials File

In order to use the provided ansible scripts, a file called `.credentials.enc` must be created as an ansible vault file with the identified values.

```text
ansible_ssh_user: <user name>
ansible_ssh_pass: <user password>
ansible_become: true
ansible_become_password: <user password>

artifactory_user: <artifact user name>
artifactory_password: <artifact user password>

github_runner_pat: <github pat>
github_runner_organization: <github repo name>
```

To create the file, paste the above text into a file called `.credentials.enc` then encrypt it with `ansible-vault`. 

```bash
ansible-vault encrypt .credentials.enc
```

## Create/Update Inventory

Before you proceed, it is necessary to update your inventory file (`inventory.yaml`) with a list of your hosts. For this example, the hosts are running a clean Ubuntu 20.04 with ssh enabled.

## Create Runners

With the credentials file created and your inventory updated, you can execute the playbook. If all goes well, this should install all the basic tools needed for the runner and will register the runner with your repo.

```bash
ansible-playbook -i inventory.yaml playbook.yaml --ask-vault-pass --extra-vars  @.credentials.enc
```

## License Runners

Because the Niagara instances are required to be licensed, running the following command first to obtain a list of the host ids for each runner, then, once you have the licenses created, running again to download and install the licenses.

```bash
ansible-playbook -i inventory.yaml license_playbook.yaml --ask-vault-pass --extra-vars  @.credentials.enc
```