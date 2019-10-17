DESCRIPTION = "Package enabling a robot to speak with a human voice by providing a Text-To-Speech ROS service"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "actionlib-msgs message-generation rospy std-msgs python3-boto3 sound-play rosunit rostest actionlib-msgs rospy std-msgs sound-play"

RDEPENDS_${PN} = "actionlib-msgs rospy std-msgs message-runtime python3-boto3 sound-play"

SRC_URI = "https://github.com/aws-gbp/tts-release/archive/release/melodic/tts/1.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "aaed2fc752bbbd69847f214a7268ceb8"
SRC_URI[sha256sum] = "ff9513ecc2e040bc38e882badee1407e351c9c1abb6cd8c75ec1ac81dcfe5cd1"

S = "${WORKDIR}/tts-release-release-melodic-tts-1.0.2-1"

inherit catkin
