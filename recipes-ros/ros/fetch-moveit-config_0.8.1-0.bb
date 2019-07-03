DESCRIPTION = "An automatically generated package with all the configuration and launch files for using the fetch_urdf with the MoveIt Motion Planning Framework"
AUTHOR = "MoveIt Setup Assistant"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "fetch-description"

RDEPENDS_${PN} = "fetch-ikfast-plugin joint-state-publisher moveit-fake-controller-manager moveit-kinematics moveit-ros-move-group moveit-planners-ompl moveit-python moveit-ros-visualization moveit-simple-controller-manager robot-state-publisher rospy xacro"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_moveit_config/0.8.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "39ec912f9f6bcd572236b3c340afff6a"
SRC_URI[sha256sum] = "cd8f245340ae00e0138b66eebbe75fb95da8a60bfbe05b329d20160f098a858f"

ROS_SPN = "fetch_ros"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_moveit_config-0.8.1-0"

inherit catkin
