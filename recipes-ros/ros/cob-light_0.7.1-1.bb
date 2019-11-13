DESCRIPTION = "This package contains scripts to operate the LED lights on Care-O-bot."
AUTHOR = "Benjamin Maidel"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation actionlib-msgs actionlib boost diagnostic-msgs roscpp sensor-msgs std-msgs visualization-msgs"

RDEPENDS_${PN} = "message-runtime rospy"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_light/0.7.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2f12721494a287278e2de5f667e2600a"
SRC_URI[sha256sum] = "75368168bfa1edf2bac15690b7979c1008f7f1081e39eafa45113f88b2d498da"

ROS_SPN = "cob_driver"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_light-0.7.1-1"

inherit catkin
