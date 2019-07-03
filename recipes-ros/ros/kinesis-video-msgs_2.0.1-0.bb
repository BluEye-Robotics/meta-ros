DESCRIPTION = "Messages for transmitting video frames to Kinesis Video Streams"
AUTHOR = "AWS RoboMaker"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation diagnostic-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/aws-gbp/kinesis_video_streamer-release/archive/release/melodic/kinesis_video_msgs/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70479cc3299c52adbbbc874cc7ed5609"
SRC_URI[sha256sum] = "6247ad1ed4da03dcf0fbac818d5759d9382c0c68d6b74a4bb824676c479e5337"

ROS_SPN = "kinesis_video_streamer"
S = "${WORKDIR}/kinesis_video_streamer-release-release-melodic-kinesis_video_msgs-2.0.1-0"

inherit catkin
