DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cells to primitive types."
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs roscpp std-msgs costmap-2d dynamic-reconfigure pluginlib cv-bridge message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/rst-tu-dortmund/costmap_converter-release/archive/release/melodic/costmap_converter/0.0.9-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bcdf6d4dc779eb94e7660ffcaae9e800"
SRC_URI[sha256sum] = "350d4ffc88daa687ea48b4fb8b04889a95b9213f2f5ef676e49ceba9120fc8c7"

S = "${WORKDIR}/costmap_converter-release-release-melodic-costmap_converter-0.0.9-0"

inherit catkin
