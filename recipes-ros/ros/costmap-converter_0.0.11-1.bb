DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cells to primitive types."
AUTHOR = "Christoph Rösmann"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs roscpp std-msgs costmap-2d dynamic-reconfigure pluginlib cv-bridge message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/rst-tu-dortmund/costmap_converter-release/archive/release/melodic/costmap_converter/0.0.11-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3b92a55ed9ff1746b432ab1e311043f5"
SRC_URI[sha256sum] = "47dc6c9c92810664e55ac37c0ddf4e7b14bda89d87d1a2c67a891933945f0bde"

S = "${WORKDIR}/costmap_converter-release-release-melodic-costmap_converter-0.0.11-1"

inherit catkin
