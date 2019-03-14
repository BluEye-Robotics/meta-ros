DESCRIPTION = "diagnostics"
AUTHOR = "Kevin Watts"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "diagnostic-aggregator diagnostic-analysis diagnostic-common-diagnostics diagnostic-updater self-test"

RDEPENDS_${PN} = "diagnostic-aggregator diagnostic-analysis diagnostic-common-diagnostics diagnostic-updater self-test"

SRC_URI = "https://github.com/ros-gbp/diagnostics-release/archive/release/melodic/diagnostics/1.9.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "242d26ecde65e705604256ccf79e3622"
SRC_URI[sha256sum] = "dec737018e36952a217efb3fda54489da280470d5230f4a5fa282027317cc03f"

S = "${WORKDIR}/diagnostics-release-release-melodic-diagnostics-1.9.3-0"

inherit catkin
