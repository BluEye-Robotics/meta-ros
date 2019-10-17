DESCRIPTION = "This package contains common message type definitions for perception tasks."
AUTHOR = "Richard Bormann"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation sensor-msgs geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/melodic/cob_perception_msgs/0.6.14-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33814fde9bd1f61f972c94f38497cc96"
SRC_URI[sha256sum] = "f0c8e8e7dc0f98f089f97101695d493772a9996b037b1f59e4c3e553a50d6ae1"

ROS_SPN = "cob_perception_common"
S = "${WORKDIR}/cob_perception_common-release-release-melodic-cob_perception_msgs-0.6.14-1"

inherit catkin
