DESCRIPTION = "Launch prbt robot in an empty Gazebo world."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro roslaunch gazebo-ros prbt-moveit-config prbt-support gazebo-ros-control"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_gazebo/0.5.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82315780e0066e7aa21ef877c12be41b"
SRC_URI[sha256sum] = "87d8f8a2429571ed83ff657aaca17fdfa630a0e45d6c1a73ffa2acf8087e34ef"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_gazebo-0.5.2-0"

inherit catkin
