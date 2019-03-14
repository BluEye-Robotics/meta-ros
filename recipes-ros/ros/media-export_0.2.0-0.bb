DESCRIPTION = "Placeholder package enabling generic export of media paths."
AUTHOR = "Dave Hershberger"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/media_export-release/archive/release/melodic/media_export/0.2.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cb8242be44f235d4883958bdb5f18acb"
SRC_URI[sha256sum] = "dba5a590101d4f4969a5f963f8fba90fff5a095e0c19770166787d22bdb799e3"

S = "${WORKDIR}/media_export-release-release-melodic-media_export-0.2.0-0"

inherit catkin
