DESCRIPTION = "The jsk_tilt_laser package"
AUTHOR = "YoheiKakiuchi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules laser-assembler tf-conversions tf dynamic-reconfigure sensor-msgs laser-filters urg-node robot-state-publisher laser-assembler tf-conversions tf dynamic-reconfigure sensor-msgs laser-filters"

RDEPENDS_${PN} = "urg-node robot-state-publisher laser-assembler tf-conversions tf dynamic-reconfigure sensor-msgs laser-filters"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_tilt_laser/2.2.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7f5bd6782988b156b43d6bda4ed940db"
SRC_URI[sha256sum] = "900a78c35d33c6dc2e243480f4ef04df27f1a1773184bd64c16b83c313adb438"

ROS_SPN = "jsk_common"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_tilt_laser-2.2.10-0"

inherit catkin
