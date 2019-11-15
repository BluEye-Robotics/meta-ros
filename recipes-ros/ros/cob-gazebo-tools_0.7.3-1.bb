DESCRIPTION = "The cob_gazebo_tools package provides helper tools for the gazebo simulation"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "gazebo-msgs geometry-msgs python3-numpy roslib rospy tf"

SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/melodic/cob_gazebo_tools/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ea448a66ed679898c74b63669f32b157"
SRC_URI[sha256sum] = "160cbd49ed7fd4c5133024490b0db28a251b52d274c638e564eded2c4d87ae70"

ROS_SPN = "cob_simulation"
S = "${WORKDIR}/cob_simulation-release-release-melodic-cob_gazebo_tools-0.7.3-1"

inherit catkin
