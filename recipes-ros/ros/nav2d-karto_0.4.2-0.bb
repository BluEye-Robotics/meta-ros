DESCRIPTION = "Graph-based Simultaneous Localization and Mapping module. Includes OpenKarto GraphSLAM library by "SRI International"."
AUTHOR = "Sebastian Kasperski"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "roscpp tf nav-msgs geometry-msgs visualization-msgs nav2d-msgs nav2d-localizer libeigen tbb suitesparse roscpp tf nav-msgs geometry-msgs visualization-msgs nav2d-msgs nav2d-localizer libeigen tbb suitesparse"

RDEPENDS_${PN} = "roscpp tf nav-msgs geometry-msgs visualization-msgs nav2d-msgs nav2d-localizer libeigen tbb suitesparse"

SRC_URI = "https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_karto/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3deb7d87c0748c8170b9bc1c3c6b15eb"
SRC_URI[sha256sum] = "43cc5478e64f5499139be34e4cdc8015fa3ca70d03bd49134c85b83e6934b0a2"

ROS_SPN = "navigation_2d"
S = "${WORKDIR}/navigation_2d-release-release-melodic-nav2d_karto-0.4.2-0"

inherit catkin
