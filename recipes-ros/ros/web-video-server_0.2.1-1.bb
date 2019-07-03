DESCRIPTION = "HTTP Streaming of ROS Image Topics in Multiple Formats"
AUTHOR = "Mitchell Wills"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp roslib cv-bridge image-transport async-web-server-cpp ffmpeg sensor-msgs"

RDEPENDS_${PN} = "roscpp roslib cv-bridge image-transport async-web-server-cpp ffmpeg sensor-msgs"

SRC_URI = "https://github.com/RobotWebTools-release/web_video_server-release/archive/release/melodic/web_video_server/0.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0a900c0c4963b0b061d3562c868ce31a"
SRC_URI[sha256sum] = "6280be50271f4d288665701715b2053fd31bc2fc0032a26956aad9cd17fc761b"

S = "${WORKDIR}/web_video_server-release-release-melodic-web_video_server-0.2.1-1"

inherit catkin
