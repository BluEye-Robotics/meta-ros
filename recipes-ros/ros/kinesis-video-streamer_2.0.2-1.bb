DESCRIPTION = "Kinesis Video Streams producer node"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common aws-ros1-common kinesis-manager roscpp kinesis-video-msgs image-transport std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/melodic/kinesis_video_streamer/2.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "151e86ad34854bed20bf107c9438b9e4"
SRC_URI[sha256sum] = "70c0ba5487f08625f2680233635e3b347579820d3129e1af5a695d429d86d636"

S = "${WORKDIR}/kinesis_video_streamer-release-release-melodic-kinesis_video_streamer-2.0.2-1"

inherit catkin
