DESCRIPTION = "HTTP Streaming of ROS Image Topics in Multiple Formats"
AUTHOR = "Mitchell Wills"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslib cv-bridge image-transport async-web-server-cpp ffmpeg sensor-msgs"

RDEPENDS_${PN} = "roscpp roslib cv-bridge image-transport async-web-server-cpp ffmpeg sensor-msgs"

SRC_URI = "https://github.com/RobotWebTools-release/web_video_server-release/archive/release/melodic/web_video_server/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d4ebb5dadcb358f1a67d8e5f266c9179"
SRC_URI[sha256sum] = "f9939d41942b68c98fd43940bcccc09d257bd981021d01d64afeaf7f0a77cca8"

S = "${WORKDIR}/web_video_server-release-release-melodic-web_video_server-0.2.0-0"

inherit catkin
