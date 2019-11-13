DESCRIPTION = "Messages for transmitting video frames to Kinesis Video Streams"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation diagnostic-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/melodic/kinesis_video_msgs/2.0.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6db7ed5e3b45ad6db826e602b919e5e4"
SRC_URI[sha256sum] = "419f536aba89e3196e900544be65ddcab91ae3a0c6969b1cc12cc43d5a89a056"

ROS_SPN = "kinesis_video_streamer"
S = "${WORKDIR}/kinesis_video_streamer-release-release-melodic-kinesis_video_msgs-2.0.2-1"

inherit catkin
