DESCRIPTION = "Kinesis Video Streams producer node"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "aws-common aws-ros1-common kinesis-manager roscpp kinesis-video-msgs image-transport std-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/melodic/kinesis_video_streamer/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "94777b21d2f4f21faac8bc284e0cd295"
SRC_URI[sha256sum] = "63f75867b432622944356a87a290bd76e4ad6bd76b5dc98306905eade52c16f1"

S = "${WORKDIR}/kinesis_video_streamer-release-release-melodic-kinesis_video_streamer-2.0.1-0"

inherit catkin
