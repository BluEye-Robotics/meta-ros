DESCRIPTION = "Package enabling a robot to speak with a human voice by providing a Text-To-Speech ROS service"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib-msgs message-generation rospy std-msgs python-boto3 sound-play rosunit rostest actionlib-msgs rospy std-msgs sound-play"

RDEPENDS_${PN} = "actionlib-msgs rospy std-msgs message-runtime python-boto3 sound-play"

SRC_URI = "https://github.com/aws-gbp/tts-release/archive/release/melodic/tts/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "446c310c5d47518e735c604d311ed2ea"
SRC_URI[sha256sum] = "1d5dd8813c3e0cf4e9e75bd364a93f1b0b02072ddd561fa0d316a75cd0a9d708"

S = "${WORKDIR}/tts-release-release-melodic-tts-1.0.1-0"

inherit catkin
