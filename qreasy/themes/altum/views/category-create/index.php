<?php defined('ALTUMCODE') || die() ?>

<?php require THEME_PATH . 'views/partials/ads_header.php' ?>

<div class="container">
    <?php display_notifications() ?>

    <nav aria-label="breadcrumb">
        <small>
            <ol class="custom-breadcrumbs">
                <li>
                    <a href="<?= url('dashboard') ?>"><?= $this->language->dashboard->breadcrumb ?></a><i class="fa fa-fw fa-angle-right"></i>
                </li>
                <li>
                    <a href="<?= url('store/' . $data->store->store_id) ?>"><?= $this->language->store->breadcrumb ?></a><i class="fa fa-fw fa-angle-right"></i>
                </li>
                <li>
                    <a href="<?= url('menu/' . $data->menu->menu_id) ?>"><?= $this->language->menu->breadcrumb ?></a><i class="fa fa-fw fa-angle-right"></i>
                </li>
                <li class="active" aria-current="page"><?= $this->language->category_create->breadcrumb ?></li>
            </ol>
        </small>
    </nav>

    <h1 class="h4 text-truncate"><?= $this->language->category_create->header ?></h1>
    <p></p>

    <form action="" method="post" role="form" enctype="multipart/form-data">
        <input type="hidden" name="token" value="<?= \Altum\Middlewares\Csrf::get() ?>" />

        <label for="url"><i class="fa fa-fw fa-sm fa-link text-muted mr-1"></i> <?= $this->language->category->input->url ?></label>
        <div class="mb-3">
            <div class="input-group">
                <div class="input-group-prepend">
                    <span class="input-group-text"><?= $data->store->full_url . $data->menu->url . '/' ?></span>
                </div>
                <input type="text" id="url" name="url" class="form-control" value="" placeholder="<?= $this->language->category->input->url_placeholder ?>" />
            </div>
            <small class="form-text text-muted"><?= $this->language->category->input->url_help ?></small>
        </div>

        <div class="form-group">
            <label for="name"><i class="fa fa-fw fa-sm fa-signature text-muted mr-1"></i> <?= $this->language->category->input->name ?></label>
            <input type="text" id="name" name="name" class="form-control" value="" placeholder="<?= $this->language->category->input->name_placeholder ?>" required="required" />
        </div>

        <div class="form-group">
            <label for="description"><i class="fa fa-fw fa-sm fa-pen text-muted mr-1"></i> <?= $this->language->category->input->description ?></label>
            <input type="text" id="description" name="description" class="form-control" value="" />
            <small class="form-text text-muted"><?= $this->language->category->input->description_help ?></small>
        </div>

        <button type="submit" name="submit" class="btn btn-block btn-primary"><?= $this->language->global->create ?></button>
    </form>

</div>
