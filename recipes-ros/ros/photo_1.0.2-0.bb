DESCRIPTION = "The photo package provides access to digital cameras. Much of the underlying functionality is provide by the gPhoto libary. The system package libgphoto2-2-dev or equivalent is required. >"
AUTHOR = "Benjamin Pitzer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp message-generation std-msgs sensor-msgs self-test libgphoto-dev roscpp message-runtime std-msgs sensor-msgs self-test libgphoto-dev"

RDEPENDS_${PN} = "roscpp message-runtime std-msgs sensor-msgs self-test libgphoto-dev"

SRC_URI = "https://github.com/bosch-ros-pkg/photo-release/archive/release/melodic/photo/1.0.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2ce757d22783ea2ffaf15e34b2f6f7ca"
SRC_URI[sha256sum] = "5ab583e7e4fa6f71d8d382ae733500dfa930700b6505f9d3fe52c92619852391"

S = "${WORKDIR}/photo-release-release-melodic-photo-1.0.2-0"

inherit catkin
