DESCRIPTION = "The photo package provides access to digital cameras. Much of the underlying functionality is provide by the gPhoto libary. The system package libgphoto2-2-dev or equivalent is required. >"
AUTHOR = "Benjamin Pitzer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libgphoto-dev opencv message-generation roscpp self-test sensor-msgs std-msgs libgphoto-dev opencv message-runtime roscpp self-test sensor-msgs std-msgs"

RDEPENDS_${PN} = "libgphoto-dev opencv message-runtime roscpp self-test sensor-msgs std-msgs"

SRC_URI = "https://github.com/bosch-ros-pkg/photo-release/archive/release/melodic/photo/1.0.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33bca0444418ba5e1865f9a249ebb783"
SRC_URI[sha256sum] = "61ab67a9bc3909382c062c6c93be55830c71b889b35326014bf3966b88fb354f"

S = "${WORKDIR}/photo-release-release-melodic-photo-1.0.3-1"

inherit catkin
