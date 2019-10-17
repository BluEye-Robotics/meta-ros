DESCRIPTION = "This package contains scripts to operate the LED lights on Care-O-bot."
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib boost diagnostic-msgs roscpp sensor-msgs std-msgs visualization-msgs"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_light/0.7.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6eff96f9342d6e5ec8154d62a0eca0f5"
SRC_URI[sha256sum] = "ddbb22232cada7190f84aacd3bca7b5dd27c05e9a78748f7e61a29df876bb7d9"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_light-0.7.0-1"

inherit catkin
