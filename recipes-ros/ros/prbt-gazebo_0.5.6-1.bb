DESCRIPTION = "Launch prbt robot in an empty Gazebo world."
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "xacro roslaunch gazebo-ros prbt-moveit-config prbt-support gazebo-ros-control"

SRC_URI = "https://github.com/PilzDE/pilz_robots-release/archive/release/melodic/prbt_gazebo/0.5.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "abdaa7c6eade79179f9102a96382827e"
SRC_URI[sha256sum] = "c51823bf3c09769663cd4a60224ff80f635ec24bd9463ba9437fdd246b3a3b8b"

ROS_SPN = "pilz_robots"
S = "${WORKDIR}/pilz_robots-release-release-melodic-prbt_gazebo-0.5.6-1"

inherit catkin
