DESCRIPTION = "Server Side tools for Authorization and Authentication of ROS Clients"
AUTHOR = "Russell Toris"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "openssl roscpp message-generation"

RDEPENDS_${PN} = "message-runtime roscpp"

SRC_URI = "https://github.com/gt-rail-release/rosauth-release/archive/release/melodic/rosauth/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f81224292d51089621bc8826e549b00"
SRC_URI[sha256sum] = "0ca3669ec558cc5222bad792320e30bb7e7d0321282b1abe49a0ff9b68fb5986"

S = "${WORKDIR}/rosauth-release-release-melodic-rosauth-1.0.1-0"

inherit catkin
