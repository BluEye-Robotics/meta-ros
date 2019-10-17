DESCRIPTION = "Launch prbt robot in an empty Gazebo world."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro roslaunch gazebo-ros prbt-moveit-config prbt-support gazebo-ros-control"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_gazebo/0.5.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d92b185a68980a9b196558feee51d523"
SRC_URI[sha256sum] = "32fb0dea7f5251366e0c0f6addd1bcecb4866bb07e1b9d822997ae60d675e43e"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_gazebo-0.5.10-1"

inherit catkin
