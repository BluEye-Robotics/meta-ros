DESCRIPTION = "A helper node that makes sure everybody knows about all static transforms, even if they are published by multiple publishers."
AUTHOR = "Martin Pecka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "rospy tf2-msgs"

SRC_URI = "https://github.com/peci1/static_transform_mux-release/archive/release/melodic/static_transform_mux/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fd1c65a714c0f2de121499b6cc99a3b"
SRC_URI[sha256sum] = "9b5bce13459bb33c3bcf4eb03f3c72e10e4b9b118f16a5a352ca9d42937e8343"

S = "${WORKDIR}/static_transform_mux-release-release-melodic-static_transform_mux-1.1.0-0"

inherit catkin
