DESCRIPTION = "Messages exclusive to Ridgeback, especially for representing low-level motor commands and sensors."
AUTHOR = "Mike Purvis"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/clearpath-gbp/ridgeback-release/archive/release/melodic/ridgeback_msgs/0.2.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "df46bad490e997d6b2a078ae22c0f0ec"
SRC_URI[sha256sum] = "022c037baf0d83040fa883b563e521d7c38e4894b45d021fb703911a1e7383f6"

ROS_SPN = "ridgeback"
S = "${WORKDIR}/ridgeback-release-release-melodic-ridgeback_msgs-0.2.2-2"

inherit catkin
