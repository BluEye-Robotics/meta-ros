DESCRIPTION = "The cob_frame_tracker package"
AUTHOR = "Felix Messmer"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib boost cob-srvs control-toolbox dynamic-reconfigure geometry-msgs interactive-markers kdl-conversions kdl-parser orocos-kdl roscpp roslint sensor-msgs std-msgs std-srvs tf visualization-msgs"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_frame_tracker/0.8.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "16a0af005d29315bfbe4c9806227c3fc"
SRC_URI[sha256sum] = "99edb7d79527805ee5010885fb6b60afe4ba9121448605699553ca960a333ccc"

ROS_SPN = "cob_control"
S = "${WORKDIR}/cob_control-release-release-melodic-cob_frame_tracker-0.8.1-1"

inherit catkin
