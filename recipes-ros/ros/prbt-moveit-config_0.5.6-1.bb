DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the prbt with the MoveIt! Motion Planning Framework"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "moveit-ros-move-group moveit-kinematics moveit-planners-ompl moveit-ros-visualization moveit-fake-controller-manager moveit-simple-controller-manager joint-state-publisher robot-state-publisher xacro  prbt-support prbt-ikfast-manipulator-plugin"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_moveit_config/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2fe3e92962f7711ca34a0bac47efcda3"
SRC_URI[sha256sum] = "4b77c1180ed3064180e366ca51f5e599efc44354643845738d37fd2c38a81ac7"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_moveit_config-0.5.6-1"

inherit catkin
