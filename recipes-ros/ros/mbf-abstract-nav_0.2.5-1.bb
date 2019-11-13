DESCRIPTION = "The mbf_abstract_nav package contains the abstract navigation server implementation of Move Base Flex (MBF). The abstract navigation server is not bound to any map representation. It provides the actions for planning, controlling and recovering. MBF loads all defined plugins at the program start. Therefor, it loads all plugins which are defined in the lists *planners*, *controllers* and *recovery_behaviors*. Each list holds a pair of a *name* and a *type*. The *type* defines which kind of plugin to load. The *name* defines under which name the plugin should be callable by the actions."
AUTHOR = "Sebastian Pütz"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=2a17ba6bda1db7ca47fe93a1560e517b"

DEPENDS = "tf roscpp actionlib actionlib-msgs dynamic-reconfigure std-msgs std-srvs nav-msgs geometry-msgs mbf-abstract-core mbf-msgs mbf-utility xmlrpcpp tf roscpp actionlib actionlib-msgs dynamic-reconfigure std-msgs std-srvs nav-msgs geometry-msgs mbf-abstract-core mbf-msgs mbf-utility xmlrpcpp"

RDEPENDS_${PN} = "tf roscpp actionlib actionlib-msgs dynamic-reconfigure std-msgs std-srvs nav-msgs geometry-msgs mbf-abstract-core mbf-msgs mbf-utility xmlrpcpp"

SRC_URI = "https://github.com/uos-gbp/move_base_flex-release/archive/release/melodic/mbf_abstract_nav/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "141633fc9d1db98086ab48c8b7df798b"
SRC_URI[sha256sum] = "5bc61f3d268b4221844aa5fbd038a14f32e5569fcf646341231a89006f34c999"

ROS_SPN = "move_base_flex"
S = "${WORKDIR}/move_base_flex-release-release-melodic-mbf_abstract_nav-0.2.5-1"

inherit catkin
